import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String result = (N % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);
        sc.close();
    }
}