import java.util.Scanner;

class Animal {
    void sound() {}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Animal[] animals = {
            new Dog(sc.next()),
            new Cat(sc.next())
        };

        for (Animal a : animals) {
            a.sound();
        }

        sc.close();
    }
}

class Dog extends Animal {
    String text;

    Dog(String text) {
        this.text = text;
    }

    @Override
    void sound() {
        System.out.println(text);
    }
}

class Cat extends Animal {
    String text;

    Cat(String text) {
        this.text = text;
    }

    @Override
    void sound() {
        System.out.println(text);
    }
}