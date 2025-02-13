package JavaInAction.Java06.ex02;

import java.time.LocalTime;

public class NotifierDecorator {
    Notifier notifier;
    
    public NotifierDecorator(Notifier notifier){
        this.notifier = notifier;
    }
    
    public void send(String message) {
        notifier.send(message);
        String result = "Sent at " + LocalTime.now();
        System.out.println(result);
    }
}
