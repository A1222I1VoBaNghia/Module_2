package ss7_module2.bai_tap;

public class Circle extends Hinh{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius*radius*3.14;
    }

    @Override
    public String toString() {
        return "Circle with radius: "+ radius;
    }
}
