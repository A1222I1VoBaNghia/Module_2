package ss3_module2.thuc_hanh;

import java.util.Scanner;

public class find_Value_In_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng:");
        int size = Integer.parseInt(scanner.nextLine());
        String[] arr = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập tên học viên:");
            arr[i] = scanner.nextLine();
        }
        System.out.println("Nhập tên học viên cần tìm kiếm:");
        String name = scanner.nextLine();
        boolean flag =false;
        for (int i = 0; i < size; i++) {
            if(name.equals(arr[i])){
                System.out.println("Vị trí của " + name+ " trong mảng là: " + (i+1));
                flag =true;
                break;
            }
        }
        if(!flag){
            System.out.println("Không tìm thấy học viên "+ name+ " trong mảng!");

        }

    }
}
