package ss1_module2.bai_tap;

import java.util.Scanner;

public class TranslateMoney {
    public static void main(String[] args) {
        final int RATE = 23000;
        Scanner scanner = new Scanner(System.in);
        int usd;
        do {
            System.out.println("Nhập số tiền (USD):");
            usd = scanner.nextInt();
        }while (usd<0);
        System.out.println("Số tiền chuyển đổi (VND): "+ usd*RATE);
    }
}
