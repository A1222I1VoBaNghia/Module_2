package ss10_module2.thuc_hanh;

public class MyListBasic<I extends Number> {
    public static void main(String[] args) {
        ListBasic <Integer> listInterger = new ListBasic<Integer>();
        listInterger.add(1);
        listInterger.add(2);
        listInterger.add(3);
        listInterger.add(4);
        System.out.println("element 4: "+listInterger.get(4));
        System.out.println("element 1: "+listInterger.get(1));
        System.out.println("element 2: "+listInterger.get(2));
        listInterger.get(-1);
        System.out.println("element -1: "+listInterger.get(-1));
    }
}
