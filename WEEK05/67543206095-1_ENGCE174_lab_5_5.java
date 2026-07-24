import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text_1 = sc.next();
        String text_2 = sc.next();
        if (text_1.equals(text_2)) {
            System.out.println("SAME");
        } else {
            System.out.println("DIFFERENT");
        }
        sc.close();
    }
}