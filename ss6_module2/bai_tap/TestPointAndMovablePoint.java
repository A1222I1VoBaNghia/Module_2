package ss6_module2.bai_tap;

public class TestPointAndMovablePoint {
    public static void main(String[] args) {
        Point point = new Point(3.3f,2.2f);
        System.out.println(point);
        MovablePoint point1 = new MovablePoint(3.3f,4.4f,5.5f,6.6f);
        System.out.println(point1);
        System.out.println(point1.move(3.3f,4.4f));
    }
}
