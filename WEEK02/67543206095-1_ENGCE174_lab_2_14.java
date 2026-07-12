import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }//endif
        }//endwhile

        System.out.println("GCD = " + a);
        sc.close();
    }
}