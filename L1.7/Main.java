import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu = sc.nextInt();
        switch (menu) {
            case 1:
                System.out.println("Water");
                break;
            case 2:
                System.out.println("Coffee");
                break;
            case 3:
                System.out.println("Tea");
                break;
            case 4:
                System.out.println("Milk");
                break;
            default:
                System.out.println("Invalid menu");
        }
    }
}