
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int sum = 0;
            int i = 1;

            while (i <= N) {
                sum += i;
                i++;
            }
            System.out.println("Sum = " + sum);
        }
    }
}