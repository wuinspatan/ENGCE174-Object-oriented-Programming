import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        sc.close();

        int fare = 0;
        if (distance <= 1) {
            fare = 35;
        } else if (distance <= 10) {
            fare = 35 + (distance - 1) * 5;
        } else {
            fare = 35 + (9 * 5) + (distance - 10) * 7;
        }

        System.out.println("Fare = " + fare);
    }
}