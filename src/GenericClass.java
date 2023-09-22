import java.util.ArrayList;

public class GenericClass<T>
{
    T type;
    private ArrayList<T> list;

    public GenericClass(T type)
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
        System.out.println(list.get(list.size()-1));
    }



}
