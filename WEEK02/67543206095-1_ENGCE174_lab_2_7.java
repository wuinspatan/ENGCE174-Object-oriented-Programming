import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int attempts = 0;
        boolean ok = false;
        while (attempts < 3) {
            int pin = sc.nextInt();
            if (pin == 1234) {
                ok = true;
                break;
            }
            attempts++;
        }
        System.out.println(ok ? "Access granted" : "Access denied");
        sc.close();
    }
}