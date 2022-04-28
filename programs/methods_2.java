// WAP to add 2 numbers using function.

package programs;
import java.util.*;
public class methods_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int a = sc.nextInt();
        System.out.print("Eneter number 2 : ");
        int b = sc.nextInt();
        int c = add(a,b);
        System.out.println("sum : " +c);
    }
    public static int add(int a, int b) {
        int c = a +b;
        return c;        
    }
}
