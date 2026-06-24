import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu = sc.nextInt();
        switch (menu) {
            case 1 -> System.out.println("Water");
            case 2 -> System.out.println("Coffee");
            case 3 -> System.out.println("Tea");
            case 4 -> System.out.println("Milk");
            default -> System.out.println("Invalid menu");
        }
    }
}