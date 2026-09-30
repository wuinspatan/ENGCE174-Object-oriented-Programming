import java.util.Scanner;

class Student {
    String name;
    Student(String name) { this.name = name; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[3];
        for (int i = 0; i < 3; i++) students[i] = new Student(sc.next());
        String target = sc.next();
        sc.close();

        boolean found = false;

        for (Student s : students) {
            if (s.name.equals(target)) { found = true; break; }
        }

        System.out.println(found ? "FOUND" : "NOT FOUND");
    }
}