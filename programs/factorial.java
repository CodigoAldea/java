package programs;
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println(" Input the number for factorial :");
        int n = a.nextInt();
        int fact =1;
        for (int i = 1; i <= n; i++) {
            fact= fact*i;
        }
        System.out.println("Factorial: "+fact);
    }
}
