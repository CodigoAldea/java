// Program to under stand working of accessor and mutator function.

package programs;

public class instance_method_2 {
   private int roll;
   private String name;
public int getRoll() { //accessor method or getter method
    return roll;
}
public void setRoll(int roll) { // mutator method or setter method
    this.roll = roll;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public void display() {
    System.out.println("Roll number : " +roll);
    System.out.println("Student name : " +name);
}
public static void main(String[] args) {
    instance_method_2 obj = new instance_method_2();
    obj.display();
}
}
