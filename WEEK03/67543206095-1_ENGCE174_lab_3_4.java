import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        if (m > n) {
            System.out.println("Max = " + m);
        } else if (n > m) {
            System.out.println("Max = " + n);
        } else {
            System.out.println("Equal");
        }
        sc.close();
    }
}