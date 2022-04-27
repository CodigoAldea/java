package programs;

class test{
    int a, b; //variables
    void abc(int x, int y){ // argument
        a = x;
        b = y;
    }
    void display(){
        System.out.println(a + " "+ b);
    }
}
public class class_insert {
    public static void main(String[] args) {
        test t1 = new test(); // new keyword 
        t1.abc(10, 8); //function calling 
        t1.display();
    }
}
