import java.util.Scanner;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // create the required array or ArrayList here
        Student[] students = new Student[2];

        // store each object or value
        for (int i = 0; i < 2; i++) {
            String name = sc.next();
            students[i] = new Student(name);
        }
        sc.close();

        // then process the collection
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i].getName());
            if (i < students.length - 1) {
                System.out.println();
            }
        }
    }
}