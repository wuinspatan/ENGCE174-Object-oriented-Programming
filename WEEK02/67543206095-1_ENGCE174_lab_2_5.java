import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((j > 1 ? " " : "") + i * j);
            }
            if (i < n) System.out.println();
        }
        sc.close();
    }
}