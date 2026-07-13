import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();

        int y;
        if (x < 0) {
            y = x * x + 1;
        } else if (x == 0) {
            y = 0;
        } else {
            y = 2 * x + 3;
        }

        System.out.println("y = " + y);
    }
}