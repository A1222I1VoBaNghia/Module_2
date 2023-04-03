package ss3_module2.bai_tap;

import java.util.Scanner;

public class call_Sum_Of_1Collum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều rộng ma trận:");
        int width = scanner.nextInt();
        System.out.print("Nhập chiều cao ma trận:");
        int height = scanner.nextInt();
        double[][] arr2D = new double[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("Nhập số thực bất kì cho ma trận ở vị trí ô thứ "+(j)+" hàng thứ "+(i)+": ");
                arr2D[i][j]=scanner.nextDouble();
                scanner.nextLine();
            }
        }
        System.out.print("Nhập cột mà bạn muốn tính tổng");
        int colNum = scanner.nextInt();
        double sum =0;
        for (int i = 0; i < width; i++) {
            sum+=arr2D[colNum][i];
        }
        System.out.println("Tổng các số ở cột thứ "+ colNum+" là: "+sum);
    }
}
