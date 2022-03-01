/*
       1
      2 2
     3 3 3
    4 4 4 4  
*/
package programs;
import java.util.*;
public class pattern_3 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = a.nextInt();
        int x = n+4-1;
        for(int i = 1; i<=n; i++){  // for rows
            for(int s = x; s !=0; s--){ // for space
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){ // for column
                System.out.print(i +" ");
            }
            System.out.println("");
            x--;
        }
    }
}
