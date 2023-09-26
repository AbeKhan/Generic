import java.util.ArrayList;
//import java.util.Stack;

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

    public void pop()
    {
        list.remove(list.size()-1);
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

    public void  evaluate(ArrayList<String> inputList)
    {
        ArrayList<Integer> hold = new ArrayList<Integer>();
        int holderA;
        int holderB;

       
            for(String item: inputList )
            {
                if(isInteger(item))
                {
                    hold.add(Integer.parseInt(item));
                }
                else if (isOperator(item))
                {
                    holderB = hold.get(hold.size()-1);
                    hold.remove(hold.size()-1);
                    holderA = hold.get(hold.size()-1);
                    hold.remove(hold.size()-1);

                    int result;
                switch (item) 
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
                        throw new IllegalArgumentException("Invalid operator: " + item);
                    
                }
                hold.add(result);
             }
            
            }
            System.out.println(hold.get(0));
        }

    public boolean isInteger(String num)
    {
        try
        {
            Integer.parseInt(num);
            return true;
        }
        catch(Exception e) 
        {
            return false;
        }
    }

    public boolean isOperator(String something)
    {
        return something.equals("+") || something.equals("-") || something.equals("*") || something.equals("/");
    }
}
