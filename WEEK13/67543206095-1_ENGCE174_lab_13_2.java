import java.util.Scanner;

class Calculator {

    void show(int value) {
        System.out.println(value);
    }

    void show(String value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        String text = scanner.next();

        Calculator printer = new Calculator();
        
        printer.show(number);
        printer.show(text);

        scanner.close();
    }
}