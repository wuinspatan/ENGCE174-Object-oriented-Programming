import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 2; // 2 and 3 are prime

        if (N < 2) {
            System.out.println("Prime Num start at 2");
            sc.close();
            return;
        } else if (N == 2) {
            count = 1;
        } else if (N == 3) {
            count = 2;
        } else {
            for (int i = 4; i <= N; i++) {
                boolean isPrime = true;
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) count++;
            }
        }
        System.out.println("Prime count = " + count);
        sc.close();
    }
}