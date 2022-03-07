package programs;
import java.util.*;
public class pattern_5 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println(" Input the number :");
        int n = a.nextInt();
        int start = 0; // for numbers 
        int count = 1; // to print the numbers and the state 
        int sp = 1; // for spaces 

        for (int i = 1; i < (n*2); i++) {
            for (int x = n-sp; x > 0; x--) { //for space
                System.out.print(" ");
            } 
            if(i<n){
                start = i; // counting number for upper traiangle 
                sp++; // for spaces 
            }
            else{
                start = n*2 -i; // for numbers of lower traiangle 
                sp--; //for spaces
            }
            for (int j = 0; j < count; j++) {
                System.out.print(start);
                if (j<count/2){
                    start--;
                }
                else{
                    start ++;
                }
            }
            if(i<n){
                count = count +2;
            }
            else{
                count = count -1;
            }
            System.out.println();
        }

    }
}
