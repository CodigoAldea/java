// we have to save 2 different values in the single variable in the class.

package programs;
class test{
    int a;
}
public class class_test_mo {
    public static void main(String[] args) {
        test t1= new test();// object 1 or 1st instance
        test t2= new test();// object 2 or 2nd instance
        t1.a =50;
        t2.a =20;
        System.out.println(t1.a +" "+t2.a);
    }
}
