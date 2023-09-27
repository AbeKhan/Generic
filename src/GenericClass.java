import java.util.ArrayList;
import java.util.EmptyStackException;

public class GenericClass<T> 
{
    T type;
    private ArrayList<T> list;

    public GenericClass() 
    {
        list = new ArrayList<T>();
    }

    public void push(T type) 
    {
        list.add(type);
    }

    public T pop() 
    {
        
        if (!list.isEmpty()) 
        {
            return list.remove(list.size() - 1);
        } 
        else 
        {
            throw new EmptyStackException();
        }
    }

    public void peek() 
    {
        if (!list.isEmpty()) 
        {
            System.out.println(list.get(list.size() - 1));
        } 
        else 
        {
            System.out.println("The stack is empty");
        }
    }

    public boolean isEmpty() 
    {
        return list.isEmpty();
    }

    public void evaluate(String input) 
    {
       GenericClass<Integer> hold = new GenericClass<Integer>();
       //ArrayList<Integer> hold = new ArrayList<Integer>();
        int holderA;
        int holderB;

        String[] tokens = input.split(" "); // Split the input into tokens

        for (String token : tokens)
         {
            if (isInteger(token)) 
            {
                hold.push(Integer.parseInt(token));
            } 
            else if (isOperator(token))
            
            {
                holderB = hold.pop();
                holderA = hold.pop();
              

                int result;
                switch (token) 
                {
                    case "+":
                        result = holderA + holderB;
                        break;
                    case "-":
                        result = holderA - holderB;
                        break;
                    case "*":
                        result = holderA * holderB;
                        break;
                    case "/":
                        result = holderA / holderB;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + token);
                }
                hold.push(result);
               // list.push((String) result)
            }
        }
        //list.peek();
    }

    public boolean isInteger(String num) 
    {
        try 
        {
            Integer.parseInt(num);
            return true;
        } 
        catch (NumberFormatException e) 
        {
            return false;
        }
    }

    public boolean isOperator(String something) 
    {
        return something.equals("+") || something.equals("-") || something.equals("*") || something.equals("/");
    }
}
