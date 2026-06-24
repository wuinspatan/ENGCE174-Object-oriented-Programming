import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        switch (N) {
            case 1:
                System.out.println("Balance");
                break;
            case 2:
                System.out.println("Withdraw");
                break;
            case 3:
                System.out.println("Deposit");
                break;
            case 4:
                System.out.println("Transfer");
                break;
            case 5:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}