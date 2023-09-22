//import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception 
    {
        GenericClass<String> test = new GenericClass<String>("s");

        String ab = "test";
        String m = "new-top";
        String f = "apple";
        test.push(ab);
        test.push(m);
        test.push(f);
        test.peek();
    }
    
}
