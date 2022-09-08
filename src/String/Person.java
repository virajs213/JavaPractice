package String;

public class Person {

        private int pid;
        private String name;
        private String email;

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person person = new Person();
       person.pid=10;
       person.name="Viraj";
       person.email="virajsrv@gmail.com";
        System.out.println(person);
}
}

