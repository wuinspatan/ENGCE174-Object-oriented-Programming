import java.util.Scanner;

class Dog {
    void bark(String text) {
        System.out.println(text);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String text = sc.next();
        sc.close();
        Dog dog     = new Dog();
        dog.bark(text);
    }
}