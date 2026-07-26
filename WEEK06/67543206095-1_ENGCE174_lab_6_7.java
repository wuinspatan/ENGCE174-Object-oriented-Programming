import java.util.Scanner;

class Main {
    public static void printStar(int n) {
        for (int i = 0; i < n; i++) System.out.print("*");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        printStar(n);
    }
}