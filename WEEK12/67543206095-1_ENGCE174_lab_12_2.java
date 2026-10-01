import java.util.Scanner;

class Person {
    String name;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        sc.close();

        Student student = new Student();
        student.name = name;
        System.out.println(student.name);
    }
}

class Student extends Person { }