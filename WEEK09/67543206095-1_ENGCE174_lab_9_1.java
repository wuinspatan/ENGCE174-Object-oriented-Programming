import java.util.Scanner;

class Student {
    String name;

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        String name = sc.next();
        Student obj = new Student();
        obj.name = name;
        System.out.print(obj.name);

        sc.close();
    }
}