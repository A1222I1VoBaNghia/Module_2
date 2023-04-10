package ss7_module2.bai_tap;

public class Square extends Hinh implements Colorable{
    private double width;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Square(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return width*width;
    }

    @Override
    public String toString() {
        return "Square with width: "+ width;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
