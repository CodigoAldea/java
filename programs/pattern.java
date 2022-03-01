package programs;
import java.util.*;
public class pattern {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter a number");
        int b = a.nextInt();

        for(int i = 1; i<=b; i++){  // for rows
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
