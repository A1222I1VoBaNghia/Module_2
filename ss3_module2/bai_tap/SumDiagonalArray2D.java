package ss3_module2.bai_tap;

import java.util.Scanner;

public class SumDiagonalArray2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kich thước ma trận (axa):");
        int a = scanner.nextInt();
        double[][] arr2D = new double[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("Nhập số thực bất kì cho ma trận ở vị trí ô thứ "+j+" hàng thứ "+i+": ");
                arr2D[i][j]=scanner.nextDouble();
                scanner.nextLine();
            }
        }
        double sum1 = 0;
        double sum2 = 0;

        for (int i = 0; i < a; i++) {
            sum1+=arr2D[i][i];
            sum2+=arr2D[i][a-i-1];
        }
        System.out.println("Tổng 2 đường chéo chính của ma trận là: "+(sum1+sum2));
    }

}
