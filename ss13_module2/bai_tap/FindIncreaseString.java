package ss13_module2.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class FindIncreaseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chuỗi bất kỳ:");
        String str = input.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(str.charAt(i));
            for (int j = i+1; j <str.length() ; j++) {
                if(str.charAt(j)>list.getLast()){
                    list.add(str.charAt(j));
                }
            }
            if(list.size()>max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for(Character ch: max){
            System.out.print(ch);
        }
        System.out.println();
    }
}
