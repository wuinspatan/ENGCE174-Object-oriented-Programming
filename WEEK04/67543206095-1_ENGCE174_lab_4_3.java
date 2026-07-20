import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[5];
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
            sum += score[i];
        }
        System.out.printf("%.2f",(double) sum / score.length);
        sc.close();
    }
}