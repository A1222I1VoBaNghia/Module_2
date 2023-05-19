package ss3_module2.bai_tap;

import java.util.Scanner;
public class MixArray {
    public static int[] createArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước của mảng:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập các số nguyên bất kỳ cho mảng: ");
            arr[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr1[] = createArray();
        int arr2[] = createArray();
        System.out.println("Mảng 1 là:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.println("Mảng 2 là:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+ " ");
        }
        int size3 = arr1.length+arr2.length;
        int arr3[]= new int[size3];
        for (int i = 0; i < size3-arr2.length; i++) {
            arr3[i]=arr1[i];
        }
        for (int i = 0; i < size3-arr1.length ; i++) {
            arr3[i+arr1.length]=arr2[i];
        }
        System.out.println();
        System.out.println("Mảng 3 là:");
        for (int i = 0; i < size3; i++) {
            System.out.print(arr3[i]+" ");

        }
    }
}
