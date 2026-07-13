import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        boolean isPrime = n > 1;
        for (int i = 2; i < n && isPrime; i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }

        System.out.println(isPrime ? "Prime" : "Not Prime");
    }
}