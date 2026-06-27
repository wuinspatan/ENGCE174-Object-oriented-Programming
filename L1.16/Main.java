import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int odd_sum = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 1) {
                odd_sum += i;
            }
        }

        System.out.println("Odd sum = " + odd_sum);
    }
}