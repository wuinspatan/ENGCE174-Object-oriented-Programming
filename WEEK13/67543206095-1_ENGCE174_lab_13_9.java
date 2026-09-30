import java.util.Scanner;

class Animal {
    void sound() {
        System.out.println("Animal");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text1 = sc.next();
        String text2 = sc.next();

        Animal a1 = new Dog(text1);
        Animal a2 = new Cat(text2);

        a1.sound();
        a2.sound();

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