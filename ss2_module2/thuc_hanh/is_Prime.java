package ss2_module2.thuc_hanh;

import java.util.Scanner;

public class is_Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên để kiểm tra: ");
        int number = scanner.nextInt();
        if(number<2){
            System.out.println(number+" không phải là số nguyên tố");
        } else {
            int i = 2;
            boolean check = true;
            while (i < number){
                if(number%i==0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println(number+ " là số nguyên tố");
            }else {
                System.out.println(number+ " không phải là số nguyên tố");
            }
        }

    }
}
