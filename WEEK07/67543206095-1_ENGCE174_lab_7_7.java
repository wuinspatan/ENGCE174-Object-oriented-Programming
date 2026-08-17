import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] grid = new int[2][2];

        // input data
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                grid[row][col] = sc.nextInt();
            }
        }
        sc.close();

        // Output sum of array
        int sum = 0; 
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 2; col++) {
                sum += grid[row][col];
            }
        }
        System.out.print(sum);
    }
}