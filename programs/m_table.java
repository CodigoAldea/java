//Mathmatics Table

package programs;
import java.util.*;
public class m_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = sc.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(a+"X"+i+"=" + (i*a));
        }
    }
}
