package ss11_module2.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class ConverHexaDecimalToBinary {
    public static void converDecimalToBinary(int number){
        Stack<Integer> stackBinary = new Stack<>();
        while (!(number ==0)){
            stackBinary.push(number%2);
            number=number/2;
        }
        for (int i = stackBinary.size()-1; i >=0; i--) {
            System.out.print(stackBinary.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thập phân cần chuyền đổi:");
        int number = scanner.nextInt();
        converDecimalToBinary(number);
    }
}
