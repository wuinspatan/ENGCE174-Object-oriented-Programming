import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        String grade;

        if (score >= 80 && score <= 100) {
            grade = "A";
        } else if (score >= 70 && score < 80) {   
            grade = "B";
        } else if (score >= 60 && score < 70) {
            grade = "C";
        } else if (score >= 50 && score < 60) {
            grade = "D";
        } else if (score >= 0 && score < 50) {
            grade = "F";
        } else {
            grade = "Score out of range!";
        }
        System.out.println("Grade = " + grade);
    }
}