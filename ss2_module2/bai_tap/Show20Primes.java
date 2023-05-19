package ss2_module2.bai_tap;

import java.util.Scanner;

public class Show20Primes {
    public static void main(String[] args) {
        int numbers = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số số nguyên tố muốn in ra: ");
        numbers = input.nextInt();
        int count1 = 0;
        if (count1 <= numbers) {
            for (int n = 2; count1 < numbers; n++) {
                boolean isPrime = true;
                for (int i = 2; i < n; i++) {
                    if (n % i ==0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime){
                    System.out.print(n + ", ");
                    count1++;
                }
            }
        }
    }
}
