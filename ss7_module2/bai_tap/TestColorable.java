package ss7_module2.bai_tap;

public class TestColorable {
    public static void main(String[] args) {
        Hinh hinh[]=new Hinh[3];
        hinh[0]= new Circle(3.5);
        hinh[1]= new Square(3.5);
        hinh[2]= new Rectangle(3.5,4.5);
        for(Hinh hinh1:hinh){
            if(hinh1 instanceof Colorable){
                System.out.println(hinh1.toString());
                System.out.println(hinh1.getArea());
                ((Colorable) hinh1).howToColor();
            }else {
                System.out.println(hinh1.toString());
                System.out.println(hinh1.getArea());
            }
        }
    }
}
