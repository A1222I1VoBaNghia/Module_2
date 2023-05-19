package ss11_module2.bai_tap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class CheckPalidrome{
    public static boolean isPalidrome(String str){
        Queue<Character>queue1 =new LinkedList<>();
        Queue<Character>queue2 =new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            queue1.add(c);
            queue2.add(c);
        }
        while (!queue1.isEmpty()) {
            if (queue1.remove() != queue2.remove()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần kiểm tra:");
        String str = input.nextLine();
        System.out.println(str + " có phải là chuỗi Palidrome không: "+isPalidrome(str));
    }
}
