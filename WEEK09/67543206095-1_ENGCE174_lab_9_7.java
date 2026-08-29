import java.util.Scanner;

class Person {
    String name;

    public static void main(String[] args) {
        Scanner sc    = new Scanner(System.in);
        String name   = sc.next();
        sc.close();
        Person person = new Person();
        person.name   = name;
        System.out.println(person.name);
    }
}