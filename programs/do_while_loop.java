/*
    do{
        code block; 
        update statement;
    }while(condition);

    exit control loop.
*/

package programs;

public class do_while_loop {
   public static void main(String[] args) {
       int i = 1;  // starting point
       do {
           System.out.println(i);
           i++; 
       } while (i<=10);
   } 
}
