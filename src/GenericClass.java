import java.util.ArrayList;

public class GenericClass<T> {
    T type;
    private ArrayList<T> list;

    public GenericClass() {
        list = new ArrayList<T>();
    }

    public void push(T type) {
        list.add(type);
    }

    public void pop() {
        list.remove(list.size() - 1);
    }

    public void peek() {
        if (!list.isEmpty()) {
            System.out.println(list.get(list.size() - 1));
        } else {
            System.out.println("The stack is empty");
        }
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void evaluate(String input) {
       // GenericClass<Integer> hold = new GenericClass<Integer>();
       ArrayList<Integer> hold = new ArrayList<Integer>();
        int holderA;
        int holderB;

        String[] tokens = input.split(" "); // Split the input into tokens

        for (String token : tokens) {
            if (isInteger(token)) {
                hold.add(Integer.parseInt(token));
            } else if (isOperator(token)) {
                holderB = hold.get(hold.size() - 1);
                hold.remove(hold.size() - 1);
                holderA = hold.get(hold.size() - 1);
                hold.remove(hold.size() - 1);

                int result;
                switch (token) {
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
                hold.add(result);
               // list.push((String) result)
            }
        }
        System.out.println(hold.get(0));
    }

    public boolean isInteger(String num) {
        try {
            Integer.parseInt(num);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean isOperator(String something) {
        return something.equals("+") || something.equals("-") || something.equals("*") || something.equals("/");
    }
}
