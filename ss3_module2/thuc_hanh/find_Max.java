package ss3_module2.thuc_hanh;

import java.util.Scanner;

public class find_Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước của mảng:");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập các số nguyên bất kỳ:");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        int max = arr[0];
        int index = 0;
        for (int i = 1; i < size; i++) {
            if(max < arr[i]){
                max = arr[i];
                index = i;
            }
        }
        System.out.println("Giá trị lớn nhất của mảng là "+ max);
        System.out.println("Vị trí của "+ max + " là " + (index+1));

    }
}
