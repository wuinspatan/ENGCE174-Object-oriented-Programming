import java.util.Scanner; 

class Animal {
    public void meow(String text) {
        System.out.print(text);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input_t = sc.next();
        sc.close();

        Cat cat = new Cat();
        cat.meow(input_t);
    }
}

class Cat extends Animal { }