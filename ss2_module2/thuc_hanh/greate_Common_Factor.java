package ss2_module2.thuc_hanh;

import java.util.Scanner;

public class greate_Common_Factor {
    public static void main(String[] args) {
        int a , b;
        int commonMax = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên a:");
        a = scanner.nextInt();
        System.out.println("Nhập số nguyên b:");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if(a==0||b==0){
            System.out.println("Không có giá trị ước chung lớn nhất cho 2 số "+ a + " và "+ b);
        }else {
            if (a != b) {
                for(int i =1; i <=a&&i<=b;i++){
                    if(a%i==0 &&b%i==0){
                        commonMax = i;
                    }
                }
                System.out.println("Ước chung lớn nhất của 2 số "+ a + " "+ b+" là: "+ commonMax);
            } else {
                System.out.println("2 số giống nhau");
            }
        }
    }
}
