import java.util.Scanner;

class Person {
    int age;
    Person(int age) { this.age = age; }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] people = new Person[2];
        people[0] = new Person(sc.nextInt());
        people[1] = new Person(sc.nextInt());
        sc.close();
        int sum = 0;
        for (Person p : people) sum += p.age;
        System.out.print(sum); 
    }
}