import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[6];
        int count = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}