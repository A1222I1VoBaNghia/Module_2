package ss7_module2.thuc_hanh;

import ss6_module2.bai_tap.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle o1, Circle o2) {
        if(o1.getRadius()>o2.getRadius()) {
            return 1;
        }else if(o1.getRadius()<o2.getRadius()){
            return -1;
        }else {
            return 0;
        }
        }
    }
