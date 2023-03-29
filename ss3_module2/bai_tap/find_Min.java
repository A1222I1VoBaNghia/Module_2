package ss3_module2.bai_tap;

import java.util.Scanner;

public class find_Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước của mảng:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập các số nguyên bất kỳ: ");
            arr[i] = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("Giá trị nhỏ nhất của mảng là: "+ minValue(arr));
    }
    public  static int minValue(int arr[]){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min <=arr[i] ){
                min = arr[i];
            }
        }
        return min;
    }
}
