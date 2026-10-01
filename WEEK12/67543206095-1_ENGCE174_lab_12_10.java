import java.util.Scanner;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input_a = sc.nextInt();
        int input_b = sc.nextInt();
        sc.close();
        SmartCalculator cal = new SmartCalculator();
        System.out.println(cal.add(input_a, input_b));
    }
}

class SmartCalculator extends Calculator { } 