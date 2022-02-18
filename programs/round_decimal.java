package programs;
import java.util.*;
public class round_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr a number :");
        double a = sc.nextDouble();
        System.out.println("Enetr a number :");
        double b = sc.nextDouble();

        a = Math.round(a * 1000);
        a = a/1000;

        b = Math.round(b * 1000);
        b = b/1000;
        
    }
}
