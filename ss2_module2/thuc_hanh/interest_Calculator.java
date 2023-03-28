package ss2_module2.thuc_hanh;

import java.util.Scanner;

public class interest_Calculator {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền muốn gửi:");
        money = scanner.nextDouble();
        System.out.println("Nhập số tháng muốn gửi:");
        month  = scanner.nextInt();
        System.out.println("Nhập lãi suất hàng năm:");
        interestRate = scanner.nextDouble();
        double totalInterest = 0.0;
        for(int i = 0; i <month;i++){
            totalInterest = money*(interestRate/100)/12*month;
        }
        System.out.println("Số tiền lãi nhận được khi gửi "+ money+ " trong "+month+" tháng là: "+ totalInterest);
    }
}
