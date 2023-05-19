package ss2_module2.bai_tap;

import java.util.Scanner;

public class ShowImage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        int choice1 = -1;
        int a,b;
        while (choice!=4){
            System.out.println("Menu");
            System.out.println("1. In hình chữ nhật");
            System.out.println("2. In tam giác vuông");
            System.out.println("3. In tam giác cân");
            System.out.println("4. Thoát");
            System.out.println("Nhập lựa cho: ");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Nhập chiều dài");
                    a = input.nextInt();
                    System.out.println("Nhập chiều rộng");
                    b = input.nextInt();
                    for (int i = 0; i < a; i++) {
                        System.out.println();
                        for (int j = 0; j < b; j++) {
                            System.out.print("*");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Nhập chiều cao");
                    a = input.nextInt();
                    System.out.println("Menu");
                    System.out.println("1. In tam giác vuông góc trên trái");
                    System.out.println("2. In tam giác vuông góc trên phải");
                    System.out.println("3. In tam giác vuông góc dưới trái");
                    System.out.println("4. In tam giác vuông góc dưới phải");
                    System.out.println("5. Thoát");
                    System.out.println("Nhập lựa cho: ");
                    choice1 = input.nextInt();
                    switch (choice1){
                        case 1:
                            for (int i = a; i >0; i--) {
                                for (int j = 0; j < i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case 2:
                            int x = 1;
                            for (int i = 0; i < a; i++) {
                                for (int k = 1; k < x; k++){
                                    System.out.print(" ");
                                }for (int j = 5; j > i ; j--) {
                                    System.out.print("*");
                                }
                                System.out.println();
                                x++;
                            }
                            break;
                        case 3:
                            for (int i = 0; i < a; i++) {
                                for (int j = 0; j <=i ; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case 4:
                            int y = 1;
                            for (int i = a; i >0; i--) {
                                for (int j = 0; j <i ; j++) {
                                    System.out.print(" ");
                                }for (int k = 0; k<y;k++){
                                    System.out.print("*");
                                }
                                System.out.println();
                                y++;
                            }
                            break;
                        case 5:
                            System.exit(5);
                        default:
                            System.out.println("Chưa chọn");
                        }
                    break;
                case 3:
                    System.out.println("Nhập chiều cao");
                    a = input.nextInt();
                    int y =1;
                    for (int i = a; i > 0; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k < y; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                        y+=2;
                    }
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("Chưa chọn");
                    }
            }
        }
    }
