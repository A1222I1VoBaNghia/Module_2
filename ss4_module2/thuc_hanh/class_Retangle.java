package ss4_module2.thuc_hanh;


import java.util.Scanner;

public class class_Retangle {
    double width, height;
    public class_Retangle(){

    }
    public class_Retangle(double width,double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return (this.height+this.width)*2;
    }
    public String display(){
        return "Rectangle{ width = "+width + ", height = "+ height+" }";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        class_Retangle rectangle = new class_Retangle(width, height);
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }
}
