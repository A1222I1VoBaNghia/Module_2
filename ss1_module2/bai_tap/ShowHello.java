package ss1_module2.bai_tap;

import java.util.Scanner;

public class ShowHello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Enter your name:");
        name = scanner.nextLine();
        System.out.println("Hello: "+ name);
    }
}
