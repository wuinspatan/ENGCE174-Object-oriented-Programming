import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int lastDigit = Math.abs(n) % 10;
        System.out.println("Last digit = " + lastDigit);
    }

    
}