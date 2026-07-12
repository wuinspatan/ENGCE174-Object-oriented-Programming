import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int N;

        while (true) {

            N = sc.nextInt();
            if (N == -1) {
                break;
            }
            sum += N;
        }
        System.out.println("Sum = " + sum);
        sc.close();
    }
}