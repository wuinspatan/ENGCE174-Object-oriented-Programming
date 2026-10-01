import java.util.Scanner;

class Person {
    String name;
    Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        sc.close();

        Student student = new Student(name);
        System.out.println(student.name);
    }
}

class Student extends Person {
    Student(String name) {
        super(name);
    }
}