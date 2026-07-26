import java.util.Scanner;

class Main {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.println(add(a, b));
        System.out.println(multiply(a, b));
    }
}