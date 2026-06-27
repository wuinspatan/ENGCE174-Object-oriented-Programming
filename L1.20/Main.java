import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N == 0) {
            System.out.println("Zero");
        } else if (N > 0) {
            System.out.println(N % 2 == 0 ? "Positive Even" : "Possitive Odd");
        } else {
            System.out.println(N % 2 == 1 ? "Negative Even" : "Negative Odd");
        }
    }
}