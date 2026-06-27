import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total_sum = 0;

        for (int i = 1; i <= 12; i++) {
            total_sum += n * i;
        }
        System.out.println("Total = " + total_sum);
    }
}