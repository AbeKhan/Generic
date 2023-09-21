//import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception 
    {
        GenericClass<String> test = new GenericClass<String>("s");

        String ab = "test";
        test.push(ab);
        System.out.println(test);
    }
    
}
