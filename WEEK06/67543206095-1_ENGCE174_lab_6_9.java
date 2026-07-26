import java.util.Scanner;

class Main {
    public static int countDigits(int number) {
        if (number == 0) return 1;
        int count = 0 ;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        int digitCount = countDigits(number);
        System.out.println(digitCount);
    }
}