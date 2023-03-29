package ss3_module2.thuc_hanh;

import java.util.Scanner;

public class count_Student_Pass {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập kích tướng mảng:");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Kích thước mảng không quá 30");
        } while (size > 30);
        array = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Nhập điển của học viên thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.print("Danh sách điểm: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.print("\n Số lượng học viên vượt qua môn học là: " + count);
    }
}
