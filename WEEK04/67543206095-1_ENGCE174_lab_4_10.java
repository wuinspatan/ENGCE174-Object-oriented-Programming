import java.util.Scanner; 

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[8];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        int find = numbers[7];
        int count = 0;

        for (int j = 0; j < numbers.length - 1; j++) {
            if (numbers[j] == find ) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}