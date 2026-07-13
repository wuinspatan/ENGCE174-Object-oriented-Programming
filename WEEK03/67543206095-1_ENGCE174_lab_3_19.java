import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gpa = sc.nextDouble();
        int activities = sc.nextInt();
        sc.close();

        if (gpa >= 3.50 && activities >= 5) {
            System.out.println("Full Scholarship");
        } else if (gpa >= 3.00 && activities >= 3) {
            System.out.println("Partial Scholarship");
        } else {
            System.out.println("No Scholarship");
        }
    }
}