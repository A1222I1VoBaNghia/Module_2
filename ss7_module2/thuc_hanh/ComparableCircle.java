package ss7_module2.thuc_hanh;

import ss6_module2.bai_tap.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle(){
    }
    public ComparableCircle(double radius){
        super(radius);
    }
    public ComparableCircle(double radius, String color, boolean filler){
        super(radius, color, filler);
    }

    public ComparableCircle(int i, int i1) {
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}
