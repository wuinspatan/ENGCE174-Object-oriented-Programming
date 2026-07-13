import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        int type = sc.nextInt();
        sc.close();

        int serviceFee = 0;
        if (type == 1) {
            serviceFee = 50;
        } else if (type == 2) {
            serviceFee = 75;
        }

        int unitCost = 0;
        if (units <= 100) {
            unitCost = units * 4;
        } else if (units <= 200) {
            unitCost = (100 * 4) + (units - 100) * 5;
        } else {
            unitCost = (100 * 4) + (100 * 5) + (units - 200) * 6;
        }

        int total = unitCost + serviceFee;
        System.out.println("Total = " + total);
    }
}