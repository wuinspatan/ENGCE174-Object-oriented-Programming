import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int weight_pc = sc.nextInt();
        int type_pc = sc.nextInt();
        int total_cost;

        if (weight_pc <= 5) {
            total_cost = 40;
        } else if (weight_pc > 5 && weight_pc <= 10) {
            total_cost = 70;
        } else {
            total_cost = 100;
        }

        switch (type_pc) {
            case 1 -> total_cost -= 20;
            case 2 -> total_cost -= 10;
            case 3 -> total_cost -= 0;
            default -> System.out.println("Invalid");
        }
        System.out.println("Shipping = " + total_cost);
    }
}