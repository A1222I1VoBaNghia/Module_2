package ss1_module2.thuc_hanh;

import java.util.Scanner;

public class Leap_Year_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter a year: ");
        year = scanner.nextInt();
//        if(year%4==0){
//            if(year%100==0){
//                if (year%400==0){
//                    System.out.printf("%d is a lap year!", year);
//                }else {
//                    System.out.printf("%d is NOT a lap year!", year);
//                }
//            } else {
//                System.out.printf("%d is a lap year!", year);
//            }
//        } else {
//            System.out.printf("%d is NOT a lap year!", year);
//        }
        boolean isLeapYear = false;
        boolean isDivBy4 = year%4==0;
        if(isDivBy4){
            boolean isDivBy100 = year%100==0;
            if(isDivBy100){
                boolean isDivBy400 = year%400==0;
                if(isDivBy400){
                    isLeapYear = true;
                }
            }else {
                isLeapYear =true;
            }
        }
        if(isLeapYear){
            System.out.printf("%d is a leap year!",year);
        }else {
            System.out.printf("%d is NOT a leap year!",year);
        }
    }
}
