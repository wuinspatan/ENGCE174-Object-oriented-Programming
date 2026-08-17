import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] grid = new int[2][3];

        // input data
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                grid[row][col] = sc.nextInt();
            }
        }
        sc.close();

        // Output the avg
        int sum = 0; 
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                sum += grid[row][col];
            }
        }
        float average = (float) sum / (grid.length * grid[0].length);
        System.out.printf("%.2f", average);
    }
}