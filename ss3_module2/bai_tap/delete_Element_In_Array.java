package ss3_module2.bai_tap;

import java.util.Scanner;

public class delete_Element_In_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước của mảng:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập các số nguyên bất kỳ: ");
            arr[i] = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.print("Nhập giá trị cần xóa trong mảng:");
        int valueDel = scanner.nextInt();
        int indexDel;
        boolean flag = false;
        for (int i = 0; i < size ; i++) {
            if(valueDel == arr[i]){
                indexDel = i;
                flag = true;
                for (int j = indexDel; j<size-1; j++) {
                    arr[j]=arr[j+1];
                }
            }
        }
        if(flag){
            System.out.print("Mảng mới là ");
            for (int i = 0; i < size-1; i++) {
                System.out.print(arr[i]+" ,");
            }
        }else {
            System.out.println("Không tồn tại giá trị "+ valueDel+" trong mảng");
        }

    }
}
