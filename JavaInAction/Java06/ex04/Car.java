package JavaInAction.Java06.ex04;

public class Car {
    public int carSpeed;

    Car(int vehicleSpeed, int carSpeed) {}

    public int getCarSpeed() {
        return carSpeed;
    }

    public void setCarSpeed(int carSpeed) {
        this.carSpeed = carSpeed;
    }

    public void displaySpeeds() {
        String message = "Speed (Car): ";
        System.out.println(message + getCarSpeed());
    }
}