package programs;
import java.util.*;
public class automorphic {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println(" Input the number :");
        int n = a.nextInt();
        int sq= n*n;
        while (n>0) {
            if(n%10 != sq%10){
                System.out.println(" Not an Automorpic Number");
                System.exit(0);
            } 
            n = n/10;
            sq = sq/10;
        }
        System.out.println("Automorphic Number ");
    }
}
