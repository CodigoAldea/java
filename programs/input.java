package programs;

// how to take input.

import java.util.*; //import  the package 
public class input{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //object 
        System.out.println("Enter a Number : ");
        int a = sc.nextInt();  // actual input
        System.out.println("you have entered : " +a);
    }
}