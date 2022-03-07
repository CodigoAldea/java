package programs;
import java.util.*;
public class armstron {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println(" Input the number :");
        int n = a.nextInt();
        int b, temp, arm =0;
        temp = n;
        for(;n!=0;n/=10){
            b = n%10;
            arm = arm+(b*b*b);
        }
        if (arm == temp) {
            System.out.println("Armstron Number");
        } else {
            System.out.println(" Not an Amstron number");
        }

    }
}
