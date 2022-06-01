// WAP to add 2 numbet using inctance method.

package programs;

public class instance_method {
    public static void main(String[] args) {
        // creating the object for the same class.
        instance_method obj = new instance_method();
        System.out.println(obj.add(11,12));
    }

    public int add(int a, int b) {   // how have we defined the function, without static keyword
        
        int c = a+b;
        return c;
    }
}
