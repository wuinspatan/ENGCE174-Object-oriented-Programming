import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        int fee;

        if (hours > 6) {
            fee = 100;
        } else if (hours == 1) {
            fee = 20;
        } else {
            fee = (hours * 10) + 10;
        }

        System.out.println("Fee = " + fee);
    }
}