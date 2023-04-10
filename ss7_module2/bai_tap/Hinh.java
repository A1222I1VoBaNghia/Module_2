package ss7_module2.bai_tap;

import ss6_module2.thuc_hanh.Shape;

public abstract class Hinh extends Shape implements Resizeable {
    @Override
    public void resize(double percent) {
        System.out.println(getArea()*percent);
    }
    public abstract double getArea();

    @Override
    public abstract String toString();
    }
