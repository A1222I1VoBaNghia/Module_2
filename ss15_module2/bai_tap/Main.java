package ss15_module2.bai_tap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.println("Nhạp cạnh a:");
            double a = input.nextDouble();
            System.out.println("Nhạp cạnh b:");
            double b = input.nextDouble();
            System.out.println("Nhạp cạnh c:");
            double c = input.nextDouble();
            ExceptionTriagle(a,b,c);
    }
    public static void ExceptionTriagle(double a, double b, double c){
        try{
            if(a<0||b<0||c<0){
                throw new IlegalTriaglException();
            }if (a+b>c&&a+c>b&&b+c>a){
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            }
            else {
                throw new IlegalTriaglException();
            }
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } catch (IlegalTriaglException e) {
            Scanner input = new Scanner(System.in);
            System.out.println("Vui lòng nhập cạnh tam giác lớn hơn 0");
            System.out.println("Nhạp cạnh a:");
            a = input.nextDouble();
            System.out.println("Nhạp cạnh b:");
            b = input.nextDouble();
            System.out.println("Nhạp cạnh c:");
            c = input.nextDouble();
            ExceptionTriagle(a,b,c);
        }catch (InputMismatchException e){
            System.out.println("Vui lòng nhập số:");
        }
    }

}
