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
        GenericClass<Integer> stack = new GenericClass<>();
        
        // Test expression: "5 3 + 2 *"
        // Should evaluate to 16 (5 + 3) * 2
        String expression = "5 3 + 2 *";
        stack.evaluate(expression);
        stack.peek();
        }
    
}
