import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        sc.close();

        int find = numbers[5];
        boolean found = false;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == find) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "FOUND" : "NOT FOUND");
    }
}