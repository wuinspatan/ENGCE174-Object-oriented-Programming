import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score;
        int sum = 0;
        float average;
        int count = 0;

        while (true) {

            score = sc.nextInt();

            if (score == -1) {
                break;
            }//endif

            if (score >= 0 && score <= 100) { 
                sum += score; count++; 
            }

        }//end while

        if (count == 0) {
            System.out.println("No valid score");
        } else {
            average = (float) sum / count;
            System.out.printf("Average = %.2f", average);
        }
        sc.close();
    
    }//end main
}//end class