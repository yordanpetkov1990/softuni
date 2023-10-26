package advanced.SmartStack;

public class Main {
    public static void main(String[] args) {
        SmartStack smartStack = new SmartStack();
        smartStack.push(6);
        smartStack.push(5);
        smartStack.push(4);
        smartStack.forEach(System.out::println);

    }
}
