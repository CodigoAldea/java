/*
    Write a Java program to find the number of days in a month. Using Switch.
*/

package programs;
import java.util.*;
public class switch_tut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year :");
        int a = sc.nextInt();
        System.out.println("Enter the month in digit : ");
        int b = sc.nextInt();

        switch (b) {
            case 1:
                System.out.println("January : 31 days");
                break;
            case 2 :
                if ((a % 400 == 0) || ((a % 4 == 0) && (a % 100 != 0))) {
                    System.out.println("Leap year : February : 29 days");
                } else {
                    System.out.println("February : 28 days");
                }
                break;
            case 3:
                System.out.println("March : 31 days");
                break;
            case 4:
                System.out.println("April : 30 days");
                break;
            case 5:
                System.out.println("May : 31 days");
                break;
            case 6:
                System.out.println("June : 30 days");
                break;
            case 7:
                System.out.println("July : 31 days");
                break;
            case 8:
                System.out.println("August : 31 days");
                break;
            case 9:
                System.out.println("September : 30 days");
                break;
            case 10:
                System.out.println("October : 31 days");
                break;
            case 11:
                System.out.println("November : 30 days");
                break;
            case 12:
                System.out.println("December : 31 days");
                break;
            default:
                System.out.println("Invalid month");
                break;
        }
    }
}
