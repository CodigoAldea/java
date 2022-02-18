/*
    Write a Java program that keeps a number from the user and generates 
    an integer between 1 and 7 and displays the name of the weekday.
*/
package programs;
import java.util.*;
public class weekdays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = sc.nextInt();
        if (a == 1){
            System.out.println("Monday");
        }
        if (a == 2){
            System.out.println("Tuesday");
        }
        if (a == 3){
            System.out.println("Wednesday");
        }
        if (a == 4){
            System.out.println("Thursday");
        }
        if (a == 5){
            System.out.println("Friday");
        }
        if (a == 6){
            System.out.println("Saturday");
        }
        if (a == 7){
            System.out.println("Sunday");
        }

    }
}
