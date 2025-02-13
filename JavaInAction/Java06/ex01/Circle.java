package JavaInAction.Java06.ex01;

public class Circle extends Shape {
double radius;

    Circle(double radius){
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}