import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dailyWage = sc.nextInt();
        int days = sc.nextInt();
        int totalSalary = dailyWage * days;
        System.out.println("Total salary = " + totalSalary);
    }
}