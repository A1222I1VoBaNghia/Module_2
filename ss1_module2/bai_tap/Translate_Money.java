package ss1_module2.bai_tap;

import com.sun.org.apache.bcel.internal.Const;

import java.util.Scanner;

public class Translate_Money {
    public static void main(String[] args) {
        final int rate = 23000;
        Scanner scanner = new Scanner(System.in);
        int usd;
        do {
            System.out.println("Nhập số tiền (USD):");
            usd = scanner.nextInt();
        }while (usd<0);
        System.out.println("Số tiền chuyển đổi (VND): "+ usd*rate);

    }
}
