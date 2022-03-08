package programs;
import java.util.*;
public class petersonsnumber {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println(" Input the number :");
        int n = a.nextInt();
        int temp = n;
        int b, fact=1, sum =0;
        while (n>0) {
            fact =1;
            b = n%10;
            //System.out.println(+b);
            //factorial
            for (int i = 1; i <= b; i++) {
                fact = fact*i;               
            }
            sum = sum+fact;
            n=n/10;
        }
        if (sum == temp){
            System.out.println("Peterson Number");
        }
        else{
            System.out.println("Not a Peterson Number");
        }
    }
}
