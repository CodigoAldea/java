package programs;
import java.util.*;

public class consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character :");
        String ch = sc.next().toLowerCase(); 
        
        if (ch.length() >1){
            System.out.println("Error!!!!");
            System.exit(0); // to exit the program when this code block runs.
        }

        //boolean uppercase = ch.charAt(0) >= 65 && ch.charAt(0) <= 90;
        //boolean lowercase = ch.charAt(0) >= 97 && ch.charAt(0) <= 122;
        //boolean vowels = ch.equals("a") || ch.equals("e") || ch.equals("i")
          //      || ch.equals("o") || ch.equals("u");
        
        
        if(ch.equals("a") || ch.equals("e") || ch.equals("i") || ch.equals("o") || ch.equals("u")){
            System.out.println("Input letter is Vowel");
        }
        else{
            System.out.println("Input letter is Consonant");
        }

        
    }
}
