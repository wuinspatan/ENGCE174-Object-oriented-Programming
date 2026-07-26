import java.util.Scanner;

class Main {
    public static void showNumber(int n) {
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        showNumber(N);
    }
    
}