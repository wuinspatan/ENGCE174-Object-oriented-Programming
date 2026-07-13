import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String result = (N == 0) ? "Zero" : (N > 0) ? "Positive" : "Negative";
        System.out.println(result);

        sc.close();
    }
}