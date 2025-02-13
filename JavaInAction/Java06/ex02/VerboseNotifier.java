package JavaInAction.Java06.ex02;

public class VerboseNotifier extends Notifier{
    public VerboseNotifier(){}
    
    @Override
    public void send(String message) {
        String log = "LOG: message sent by VerboseNotifier";
        super.send(message);
        System.out.println(log);
    }
}