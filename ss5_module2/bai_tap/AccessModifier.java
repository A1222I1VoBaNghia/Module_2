package ss5_module2.bai_tap;
class Circle{
    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return getRadius()*getRadius()*3.14;
    }
}
public class AccessModifier {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        circle.getRadius();
        System.out.println(circle.getArea());
    }
}
