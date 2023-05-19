package ss11_module2.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static boolean isBalanced(String expression){
        Stack<Character> bStack = new Stack<>();
        for (char c : expression.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                bStack.push(c);
            }
            else if (c == ')' || c == '}' || c == ']') {
                if (bStack.isEmpty()) {
                    return false;
                }
                char left = bStack.pop();
                if (c == ')' && left != '(') {
                    return false;
                } else if (c == '}' && left != '{') {
                    return false;
                } else if (c == ']' && left != '[') {
                    return false;
                }
            }
        }
        // Nếu Stack vẫn còn tồn tại thì false
        return bStack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập biểu thức:");
        String expression = input.nextLine();
        isBalanced(expression);
    }
}
