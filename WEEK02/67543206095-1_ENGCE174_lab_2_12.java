import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int N = keyboard.nextInt();
        int count = 0;
        
        // counting index of N -> 10 -> 2 , 1000 -> 4, 0 -> 1
        if (N == 0) {
            count = 1;
        } else {
            while (N > 0) {
                count++;
                N /= 10;
            }//endwhile
        }//endif
        System.out.print("Digits = " + count);
        keyboard.close();
    }
}