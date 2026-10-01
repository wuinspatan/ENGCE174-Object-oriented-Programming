import java.util.Scanner;

class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Scanner sc   = new Scanner(System.in);
        String input = sc.next();
        sc.close();

        Student std  = new Student();
        std.setName(input);
        System.out.println(std.getName());
    }
}

class Student extends Person { }