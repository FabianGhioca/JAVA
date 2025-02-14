package JavaInAction.Java06.ex04;

public class Vehicle extends Car {
    public int vehicleSpeed;

    Vehicle(int vehicleSpeed, int carSpeed) {
        super(vehicleSpeed, carSpeed);
        this.vehicleSpeed = vehicleSpeed;
    }

    public int getVehicleSpeed() {
        return vehicleSpeed;
    }

    public void setVehicleSpeed(int vehicleSpeed) {
        this.vehicleSpeed = vehicleSpeed;
    }

    @Override
    public void displaySpeeds() {
        super.displaySpeeds();
        System.out.println(getVehicleSpeed());
    }
}