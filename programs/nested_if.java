package programs;

public class nested_if {
    public static void main(String[] args) {
        int a = 6, b= 10, c = 4;
        if(a > b){
            if(a>c){
                System.out.println("A is the greatest");
            }
            else{
                System.out.println("C is greatest");
            }
        }
        else if (b >c){
            System.out.println("B is greatest");
        }
        else{
            System.out.println("C is greatest");
        }
    }
}
