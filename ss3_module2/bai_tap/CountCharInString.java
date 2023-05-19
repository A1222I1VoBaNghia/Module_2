package ss3_module2.bai_tap;

import java.util.Scanner;

public class CountCharInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi bất kỳ: ");
        String str = scanner.nextLine();
        System.out.print("Nhập 1 ký tự bạn muốn kiểm tra: ");
        char character = scanner.nextLine().charAt(0);
        int count =0;
        boolean flag = false;

        for (int i = 0; i < str.length(); i++) {
            char chaStr = str.charAt(i);
            if(character ==chaStr){
                count++;
                flag = true;
            }
        }
        if(flag){
            System.out.println("Ký tự "+character+" xuất hiện "+count+" lần trong chuỗi "+ str);
        }else {
            System.out.println("Ký tự "+character+" không xuất hiện trong chuỗi "+ str);
        }
    }
}
