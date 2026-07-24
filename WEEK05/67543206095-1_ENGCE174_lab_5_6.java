import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text_1 = sc.next();
        System.out.println(text_1.substring(0,3));
        sc.close();
    }
}