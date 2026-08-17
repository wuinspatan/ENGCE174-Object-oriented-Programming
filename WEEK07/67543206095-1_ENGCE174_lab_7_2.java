import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] grid = new int[3][2];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 2; col++) {
                grid[row][col] = sc.nextInt();
            }
        }
        sc.close();

        int sum = 0;
        for (int col = 0; col < grid[0].length; col++) {
            sum += grid[0][col];
        }
        System.out.println(sum);
    }
}