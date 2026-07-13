import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        int member = sc.nextInt();
        sc.close();

        double discount = 0;
        if (member == 1 && price >= 1000) {
            discount = 0.15;
        } else if (member == 1 && price < 1000) {
            discount = 0.10;
        } else if (member == 0 && price >= 1000) {
            discount = 0.05;
        }

        double net = price * (1 - discount);
        System.out.println("Net = " + net);
    }
}