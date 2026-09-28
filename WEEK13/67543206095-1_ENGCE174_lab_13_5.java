import java.util.Scanner;

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

class Animal {
    void sound() {
        System.out.println("Animal");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Animal a = new Cat(sc.next());
        a.sound();

        sc.close();
    }
}