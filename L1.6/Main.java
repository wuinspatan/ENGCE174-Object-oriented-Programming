import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        String grade;

        if (score >= 80) {
            grade = "A";
        } else if (score >= 70) {   
            grade = "B";
        } else if (score >= 60) {
            grade = "C";
        } else if (score >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Grade = " + grade);
    }
}