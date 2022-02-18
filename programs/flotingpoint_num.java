/*
Write a Java program that reads a floating-point number and prints "zero" if the number is zero. 
Otherwise, print "positive" or "negative". 
Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
*/
package programs;
import java.util.*;

public class flotingpoint_num {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the floating point number :");
        float a = sc.nextFloat();
        if (a == 0){
            System.out.println("Zero");
        }
        else if ( a > 0){ // checking for the positive number 
            if(a < 1){  // checking to add the small
                System.out.println("Small Positive");
            }
            else if (a > 1000000){ // checking to add large
                System.out.println("Large Positive");
            }
            else{
                System.out.println("Positive");
            }            
        }
        else{ // for negative number 
            if (Math.abs(a)<1){ // to convert the negetive number to absolute value .
                System.out.println("Small Negative");
            }
            else if ( Math.abs(a)>1000000){
                System.out.println("Large Negative");
            }
            else{
                System.out.println("Negative");
            }
        }
        
    }
    
}
