package ss10_module2.bai_tap;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> ll = new MyList<>(15);
        ll.add(0,1);
        ll.add(1,2);
        ll.add(2,3);
        ll.add(4,5);
        ll.add(5,6);
        ll.add(3,4);
        ll.add(9);
        for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i));
        }
        ll.contains(7);
        ll.remove(5);
        ll.clone();
        ll.ensureCapacity(15);
    }
}
