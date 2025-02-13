package JavaInAction.Java06.ex00;

public class Logger {
    String operation;

    public void log(double a, String operation , double b, double calculator) {
        System.out.println("LOG: " + a + operation + b + " = " + calculator);
    }
}