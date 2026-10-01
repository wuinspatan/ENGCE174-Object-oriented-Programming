import java.util.Scanner;

class Animal {
    String name;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        String name = sc.next();
        Dog dog = new Dog();
        dog.name = name;
        System.out.print(dog.name);
        sc.close();
    }
}

class Dog extends Animal { } 