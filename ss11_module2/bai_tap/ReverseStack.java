package ss11_module2.bai_tap;


import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public static void stackIntReverse(Stack<Integer> stack){
        Stack<Integer> stack1 = new Stack<>();
        while (!stack.isEmpty()){
            stack1.push(stack.pop());
        }
        stack = stack1;
        for(int i = 0; i< stack.size();i++){
            System.out.println(stack.get(i));
        }
    }
    public static void stackStringReverse(String string){
        Stack<String> wStack = new Stack<>();
        Stack<String> mWord = new Stack<>();
        for (int i = 0; i <string.length(); i++) {
            mWord.push(string.substring(i,i+1));
            wStack.push(mWord.pop());
        }
        while (!wStack.isEmpty()){
            mWord.push(wStack.pop());
        }
        for (int i = 0; i < mWord.size(); i++) {
            System.out.print(mWord.get(i));
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số phần tử cho stack");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử cho stack:");
            stack.push(input.nextInt());
        }
        System.out.println("Stack sau khi đảo là:");
        stackIntReverse(stack);

        System.out.println("Nhập chuỗi bất kì:");
        String str = input.nextLine();
        System.out.println("Chuỗi sau khi đảo là:");
        stackStringReverse(str);
    }
}
