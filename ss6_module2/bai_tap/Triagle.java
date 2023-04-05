package ss6_module2.bai_tap;

import ss6_module2.thuc_hanh.Shape;

public class Triagle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triagle() {
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    public Triagle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triagle(String color, boolean filler, double side1, double side2, double side3) {
        super(color, filler);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double a = getPerimeter() / 2;
        return Math.sqrt(a * (a - getSide1()) * (a - getSide2()) * (a - getSide3()));
    }

    public double getPerimeter() {
        return getSide1() + getSide2() + getSide3();
    }

    @Override
    public String toString() {
        return "Triagle{" +
                "side1 = " + side1 +
                ", side2 = " + side2 +
                ", side3 = " + side3 +
                ", have Area " + getArea() +
                ", and Perimeter " + getPerimeter() +
                '}';
    }
}
