import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        if (N % 3 == 0 && N % 5 == 0) {
            System.out.println("Divisible by both");
        } else if (N % 3 == 0) {
            System.out.println("Divisible by 3");
        } else if (N % 5 == 0) {
            System.out.println("Divisible by 5");
        } else {
            System.out.println("Not divisible");
        }
        sc.close();
    }
}