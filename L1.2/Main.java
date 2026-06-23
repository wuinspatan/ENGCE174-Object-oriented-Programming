import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String studentID = sc.nextLine();
        String name = sc.nextLine();
        String faculty = sc.nextLine();
        System.out.println("\nStudent ID:" + studentID);
        System.out.println("Name:" + name);
        System.out.println("Faculty:" + faculty);
    }
}