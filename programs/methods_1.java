// WAP to check if the number entered is even or odd using function.
package programs;
import java.util.*;

public class methods_1 {
    //definition
    public static void evenodd(int a) {
        if (a%2==0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        evenodd(a);  // a is known as argument 
    }
    
}
