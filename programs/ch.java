package programs;

// how to take input.

import java.util.*; //import  the package 
public class ch{
    private static Scanner sc;

    public static void main(String[] args){
        sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int a = sc.nextInt();  // actual input
        System.out.println("you have entered : " +a);
    }
}