package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Employee {
    private String name;
    private String empCode;
    private Integer  age;
    private Double salary;


    public Employee(String name, String empCode, Integer age, Double salary) {
        this.name = name;
        this.empCode = empCode;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empCode='" + empCode + '\'' +
                ",age=" + age + '\'' +
                ",salary=" + salary +
                '}' ;
    }
}
class EmpNameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }
}
class EmpAgeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getAge().compareTo(e2.getAge());
    }
}
class EmpCodeCompare implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getEmpCode().compareTo(e2.getEmpCode());
    }
}
class EmpSalCompare implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getSalary().compareTo(e2.getSalary());
    }
}
class EmpComparatorImpl {
    public static void main(String[] args) {
        Employee e1 = new Employee("Vaibhav", "210", 22, 3000.0);
        Employee e2 = new Employee("Sagar", "211", 26, 20000.0);
        Employee e3 = new Employee("Sanket", "212", 24, 30000.0);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        Collections.sort(employees, new EmpAgeComparator().reversed());
        System.out.println("By Using Age");
        for (Employee e : employees) {
            System.out.println(e.toString());
        }
        Collections.sort(employees, new EmpNameComparator());
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("By Using Name");
        for (Employee e : employees) {
            System.out.println(e.toString());
        }
        Collections.sort(employees, new EmpCodeCompare());
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("By Using EmpCode");
        for (Employee e : employees) {
            System.out.println(e.toString());
        }
        Collections.sort(employees, new EmpSalCompare().reversed());
        System.out.println("By Using Salary");
        System.out.println("----------------------------------------------------------------------------");
        for (Employee e : employees) {
            System.out.println(e.toString());
        }



    }
}
