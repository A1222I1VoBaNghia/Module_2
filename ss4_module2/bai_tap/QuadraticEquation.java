package ss4_module2.bai_tap;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class QuadraticEquation {
    private double a,b,c;
    public QuadraticEquation(){

    }
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public  double geta(){
        return this.a;
    }
    public  double getb(){
        return this.b;
    }
    public  double getc(){
        return this.c;
    }
    public double getDiscriminant(){
        return this.getb()*this.getb()-4*this.geta()*this.getc();
    }
    public double getRoot1(){
        return ((-this.getb())+Math.sqrt(this.getb()*this.getb()-4*this.geta()*this.getc()))/2*this.geta();
    }
    public double getRoot2(){
        return ((-this.getb())-Math.sqrt(this.getb()*this.getb()-4*this.geta()*this.getc()))/2*this.geta();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập giá trị b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập giá trị c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quad = new QuadraticEquation(a,b,c);
        if(quad.getDiscriminant()!=0){
            if(quad.getDiscriminant()>0){
                System.out.println("Nghiệm 1 của phương trình "+a+"x2 + "+b+"y + "+c+" = 0 là:"+quad.getRoot1());
                System.out.println("Nghiệm 2 của phương trình "+a+"x2 + "+b+"y + "+c+" = 0 là:"+quad.getRoot2());
            }else {
                System.out.println("Phương trình vô nghiệm");
            }
        }else {
            System.out.println("Nghiệm kép của phương trình "+a+"x2 + "+b+"y + "+c+" = 0 là:"+quad.getRoot1());
        }
    }

}
