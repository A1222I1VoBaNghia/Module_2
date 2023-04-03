package ss2_module2.bai_tap;

public class show_Primes_less_100 {
    public static void main(String[] args) {
        for (int j = 0; j < 100; j++) {
            if(checkIsPrime(j)!=0){
            System.out.print(checkIsPrime(j) + ", ");
            }
        }
    }
    public static int checkIsPrime(int number) {
        boolean flag = true;
        if (number < 2) {
            flag = false;
        } else if (number == 2) {
            flag = true;
        } else if (number % 2 == 0) {
            flag = false;
        } else {
            for (int i = 3; i < number - 1; i += 2) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            return number;
        }else
            return 0;
    }
}

