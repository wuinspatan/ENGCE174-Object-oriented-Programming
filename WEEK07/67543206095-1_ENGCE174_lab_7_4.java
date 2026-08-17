import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] grid = new int[2][2];

        // Input array 
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                grid[row][col] = sc.nextInt();
            }
        }
        sc.close();

        // Output Max value in Array
        int max_num = grid[0][0];
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                if (grid[row][col] > max_num) {
                    max_num = grid[row][col];
                }
            }
        }
        System.out.print(max_num);
    }
}