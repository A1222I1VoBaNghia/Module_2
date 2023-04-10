package ss7_module2.bai_tap;

public class TestResizeable {
    public static void main(String[] args) {
        Hinh [] hinh = new Hinh[3];
        hinh[0]= new Circle(3.1);
        hinh[1] = new Rectangle(5.5,6.6);
        hinh[2] = new Square(5.5);
        for(Hinh hinh1: hinh){
            System.out.println(hinh1);
            System.out.println("Diện tích là:");
            System.out.println(hinh1.getArea());
            System.out.println("Diện tích sau khi thay đổi kích thước là:");
            hinh1.resize(1.3);
        }
    }
}
