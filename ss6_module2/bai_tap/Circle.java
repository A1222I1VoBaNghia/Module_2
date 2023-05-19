package ss6_module2.bai_tap;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "green";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius) {
    }

    public Circle(double radius, String color, boolean filler) {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(double radius){
        return getRadius()*getRadius()*3.14;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
class Cylinder extends Circle{
    private double height;
    public Cylinder(){
        height = 1.0;
    }
    public Cylinder(double radius, double height, String color){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public double getVolume(double height, double radius){
        return getRadius()*2*3.14*getHeight();
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return  "A Cylinder with height="
                + getHeight()
                + ", which is a subclass of "
                + super.toString();
    }
}
