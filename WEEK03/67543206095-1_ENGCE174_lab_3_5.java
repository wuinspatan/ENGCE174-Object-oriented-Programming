import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int x = sc.nextInt();
        int min = m;

        if (n < m) {
            min = n;
        }
        if (x < min) {
            min = x;
        }
        System.out.println("Min = " + min);
        sc.close();
    }

    
}