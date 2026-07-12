import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int evenCount = 0;
        int oddCount = 0;

        while (true) {
            int n = sc.nextInt();
            if (n == -1) break;
            if (n % 2 == 0) evenCount++;
            else oddCount++;
        }
        System.out.println("Even = " + evenCount);
        System.out.println("Odd = " + oddCount);
        sc.close();
    }
}