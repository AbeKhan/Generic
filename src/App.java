import java.util.ArrayList;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        
        GenericClass<String> test = new GenericClass<String>();
        /* 
        System.out.println(test.isEmpty());
        String ab = "test";
        String m = "new-top";
        String f = "apple";
        test.push(ab);
        test.push(m);
        test.push(f);
        test.peek();
        test.pop();
        test.peek();
        System.out.println(test.isEmpty());
        */

        // Create an instance of GenericClass
        GenericClass<Integer> stack = new GenericClass<>();

        // Define a postfix expression as an ArrayList of strings
        ArrayList<String> postfixExpression = new ArrayList<>();
        postfixExpression.add("5");
        postfixExpression.add("3");
        postfixExpression.add("+");
        postfixExpression.add("7");
        postfixExpression.add("*");

        // Evaluate the postfix expression
        stack.evaluate(postfixExpression);

        // Peek at the result
        stack.peek(); // This will print the result
            
        }
    
}
