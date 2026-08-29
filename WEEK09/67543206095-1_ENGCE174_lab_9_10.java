import java.util.Scanner;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a      = sc.nextInt();
        int b      = sc.nextInt();
        sc.close();

        Calculator calc = new Calculator();
        System.out.println(calc.add(a, b));
    }
}