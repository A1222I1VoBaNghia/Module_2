package ss6_module2.bai_tap;

public class TestCircleANDCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle(2,"blue");
        System.out.println(circle);
        System.out.println(circle.getArea(2));
        Cylinder cylinder = new Cylinder(10,2,"yellow");
        System.out.println(cylinder);
        System.out.println(cylinder.getVolume(10,2));
    }
}
