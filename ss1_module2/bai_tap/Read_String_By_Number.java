package ss1_module2.bai_tap;

import org.jetbrains.annotations.Unmodifiable;

import java.util.Scanner;
import java.lang.String;

public class Read_String_By_Number {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number, units, dozens, hundreds;
        System.out.println("Enter a number: ");
        number = scanner.nextInt();
        units = number % 10;
        hundreds = number / 100;
        if (number > 20 && number < 100) {
            dozens = number / 10;
        } else {
            dozens = (number - hundreds * 100) / 10;
        }
        System.out.println("Units: " + units);
        System.out.println("Dozens: " + dozens);
        System.out.println("Hundreds: " + hundreds);
        if(hundreds==0){
            System.out.print("");
            if(dozens==0){
                System.out.print("");
                if (units==0){
                    System.out.print("Zero");
                } else
                    System.out.print(read_Units(units,true));
            } else if(dozens==1){
                switch (number){
                    case 10:
                        System.out.print("ten");
                        break;
                    case 11:
                        System.out.print("eleven");
                        break;
                    case 12:
                        System.out.print("twelve");
                        break;
                    case 13:
                        System.out.print("thirteen");
                        break;
                    case 14:
                        System.out.print("fourteen");
                        break;
                    case 15:
                        System.out.print("fifteen");
                        break;
                    case 16:
                        System.out.print("sixteen");
                        break;
                    case 17:
                        System.out.print("seventeen");
                        break;
                    case 18:
                        System.out.print("eighteen");
                        break;
                    case 19:
                        System.out.print("nineteen");
                        break;
                }
            } else{
                System.out.print(read_Units(dozens,false)+" ");
                System.out.print(read_Units(units,true));
            }
        } else {
            System.out.print(read_Units(hundreds,true)+" hundred ");
            if(dozens==0){
                System.out.print("");
                if (units==0){
                    System.out.print("");
                } else
                    System.out.print(read_Units(units,true));
            } else if(dozens==1){
                switch (dozens*10+units){
                    case 10:
                        System.out.print("ten");
                        break;
                    case 11:
                        System.out.print("eleven");
                        break;
                    case 12:
                        System.out.print("twelve");
                        break;
                    case 13:
                        System.out.print("thirteen");
                        break;
                    case 14:
                        System.out.print("fourteen");
                        break;
                    case 15:
                        System.out.print("fifteen");
                        break;
                    case 16:
                        System.out.print("sixteen");
                        break;
                    case 17:
                        System.out.print("seventeen");
                        break;
                    case 18:
                        System.out.print("eighteen");
                        break;
                    case 19:
                        System.out.print("nineteen");
                        break;
                }
            } else{
                System.out.print(read_Units(dozens,false)+" ");
                System.out.print(read_Units(units,true));
            }

        }
    }
    public static String  read_Units(int unit,boolean flag) {
        String str;
        switch (unit) {
            case 1:
                    str = "one";
                    break;
            case 2:
                if (flag){
                    str = "two";
                    break;
                }else{
                    str = "twenty";
                    break;
                }
            case 3:
                if (flag){
                    str = "three";
                    break;
                }else{
                    str = "thirty";
                    break;
                }
            case 4:
                if (flag){
                    str = "four";
                    break;
                }else{
                    str = "forty";
                    break;
                }
            case 5:
                if (flag){
                    str = "five";
                    break;
                }else{
                    str = "fifty";
                    break;
                }
            case 6:
                if (flag){
                    str = "six";
                    break;
                }else{
                    str = "sixty";
                    break;
                }
            case 7:
                if (flag){
                    str = "seven";
                    break;
                }else{
                    str = "seventy";
                    break;
                }
            case 8:
                if (flag){
                    str = "eight";
                    break;
                }else{
                    str = "eighty";
                    break;
                }
            case 9:
                str = "nine";
                break;
            default:
                str = "Out of ability!";
                break;
        }
        return str;
    }
}
