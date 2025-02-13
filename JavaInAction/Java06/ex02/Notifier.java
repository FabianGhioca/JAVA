package JavaInAction.Java06.ex02;

public class Notifier {
    Notifier(){}
    
    public void send(String message) {
        String result = "Sending: " + message;
        System.out.println(result);
    }
}
