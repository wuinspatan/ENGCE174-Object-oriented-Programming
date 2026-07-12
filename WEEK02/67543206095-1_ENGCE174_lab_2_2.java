import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        do {
            N = sc.nextInt();
        } while (N <= 0);

        System.out.println("Accepted = " + N);
        sc.close();
    }
}