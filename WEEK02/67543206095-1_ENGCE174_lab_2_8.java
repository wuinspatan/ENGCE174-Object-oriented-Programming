import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;

        do {
            menu = sc.nextInt();
            if (menu == 1) {
                System.out.println("Add");
            } else if (menu == 2) {
                System.out.println("Edit");
            } else if (menu == 3) {
                System.out.println("Delete");
            } else if (menu > 3 || menu < 0) {
                System.out.println("Invalid");
            }
        } while (menu != 0);
        if (menu == 0) System.out.println("Exit");
        sc.close();
    }
}