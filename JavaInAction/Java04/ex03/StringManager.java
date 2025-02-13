package JavaInAction.Java04.ex03;

public class StringManager {
    String originalStr; 
    String reversed = "";

    StringManager(String originalString) {
        this.originalStr = originalString;
    }

    public String reverse(){
        for (int i = 0; i < originalStr.length(); i++) {
            reversed = originalStr.charAt(i) + reversed;
        }
    return reversed;
    }
}