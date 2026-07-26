import java.util.Scanner;

class Main {
    public static void sayHello() {
        System.out.println("Hello, Java");
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        for (int i = 0; i < N; i++) sayHello();
    }
    
}