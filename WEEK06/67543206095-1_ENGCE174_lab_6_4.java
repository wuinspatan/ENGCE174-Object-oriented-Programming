import java.util.Scanner;

class Main {
    public static void square(int n) {
        System.out.println(n*n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        square(n);
    }
    
}