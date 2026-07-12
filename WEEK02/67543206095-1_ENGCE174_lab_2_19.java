import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;

        do {
            menu = sc.nextInt();
            
            switch (menu) {
                case 1: {
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println(a + b);
                    break;
                }
                case 2: {
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println(a - b);
                    break;
                }
                case 0:
                    System.out.println("Exit");
                    break;
                default: {
                    System.out.println("Invalid menu");
                    break;
                }
            }
        } while (menu != 0);
        sc.close();
    }
}