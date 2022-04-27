package programs;
//making a new class test.
class test{
    int a, b;
}
public class class_test {
    public static void main(String[] args) {
        // create object 
        test t= new test();    // t ist he object for test class
        t.a =10; //assinging value to the variables in test class using the object.
        t.b =20;
        System.out.println(t.a +" "+ t.b);
    }
}
