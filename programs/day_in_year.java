/*
    Write a program to fine the number of days in a month in a given year.
*/

package programs;
import java.util.*;
public class day_in_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year :");
        int b = sc.nextInt();
        System.out.println("Enter the month in digit : ");
        int a = sc.nextInt();

        if (a == 1){
            System.out.println("January : 31 days");
        }
        if (a == 2){
            if ((b % 400 == 0) || ((b % 4 == 0) && (b % 100 != 0))) {
                System.out.println("Leap year : February : 29 days");
            } else {
                System.out.println("February : 28 days");
            }
        }
        else if (a == 3){
            System.out.println("March : 31 days");
        }
        else if (a == 4){
            System.out.println("April : 30 days");
        }
        else if (a == 5){
            System.out.println("MAy : 31 days");
        }
        else if (a == 6){
            System.out.println("June : 30 days");
        }
        else if (a == 7){
            System.out.println("July : 31 days");
        }
        else if (a == 8){
            System.out.println("August : 31 days");
        }
        else if (a == 9){
            System.out.println("September : 30 days");
        }
        else if (a == 10){
            System.out.println("October : 31 days");
        }
        else if (a == 11){
            System.out.println("November : 30 days");
        }
        else if (a == 12){
            System.out.println("December : 31 days");
        }
        else{
            System.out.println("Invalid month");
        }
    }
}
