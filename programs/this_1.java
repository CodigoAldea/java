// 1st property of this kew word.

package programs;

class student { // secondary class
int roll;
String name;
float fee;
student(int roll, String name, float fee){ // constructor
    this.roll = roll;  // this keyword usage
    this.name = name;
    this.fee = fee;
}
void display(){
    System.out.println(roll + " " + name + " " +fee);
} 
}
public class this_1 { // main class
    public static void main(String[] args) {
        student s1 = new student(10, "sam", 500f);
        student s2 = new student(11, "abc", 600f);
        s1.display();
        s2.display();
    }
}
