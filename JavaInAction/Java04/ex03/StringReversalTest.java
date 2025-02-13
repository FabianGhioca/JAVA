package JavaInAction.Java04.ex03;

public class StringReversalTest {
    public static void main(String[] args) {
        StringManager manipulator = new StringManager("Hello, world!");
        String reversed = manipulator.reverse();
        System.out.println(reversed);
    }
}