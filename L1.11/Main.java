import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        int bill;

        if (units >= 0 && units <= 100) {
            bill = units * 4;
        } else if (units >= 101 && units <= 200) {
            units -= 100;
            bill = units * 5 + 400;
        } else { 
            units -= 200;
            bill = (units * 6) + 900;
        }

        System.out.println("Bill = " + bill);
    }
}