package Constructor;
//Parameterised Constructor
public class Employee {
    int id;
    String name;
    Employee() {
        System.out.println("In Default Constructor");
    }
    Employee (String nm) {

    }
    Employee(int i,String nm ) {
        id = i;
        name = nm;
    }
    void display() {
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
    }
}
class EmployeeImp {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Binod");
        e1.display();
        Employee e2 = new Employee("Vinod");
        e2.display();
        Employee e3 = new Employee();
    }
}
