// 2nd property of this kew word.

package programs;
class A{
    void first(){
        System.out.println("Hello from first");
    }
    void second(){
        System.out.println("Hello from second");
        this.first();
    }
}
public class this_2 {
    public static void main(String[] args) {
        A obj = new A();
        obj.second();
    }
}
