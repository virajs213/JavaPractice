package Constructor;
//Default Constructor
public class Student {
    int id;
    String name;
    Student()
    {
        System.out.println("It is Default Constructor");
    }
    void display() {
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
    }
}
class StudentImpl {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
        Student s2 = new Student();
        s2.display();

    }
}
