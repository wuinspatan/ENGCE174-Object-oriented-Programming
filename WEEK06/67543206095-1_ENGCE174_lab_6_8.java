import java.util.Scanner;

class Main {
    public static void sayHello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        sayHello(name);
        sc.close();
    }
}