import java.util.Scanner;

class Calculator {
    private int a;
    private int b;

    public Calculator(int a_, int b_) {
        this.a = a_;
        this.b = b_;
    }

    public int sum() { 
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a_in = sc.nextInt();
        int b_in = sc.nextInt();
        sc.close();

        Calculator calx = new Calculator(a_in, b_in);
        System.out.print(calx.sum());
    }
}