import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] grid = new int[3][2];

        // Input array
        for (int row = 0; row < grid.length; row++ ) {
            for (int col = 0; col < grid[row].length; col++) {
                grid[row][col] = sc.nextInt();
            }
        }
        sc.close();

        // Sum of column 2
        int sum = 0;
        for (int row = 0; row < grid.length; row++) {
            sum += grid[row][1];
        }
        System.out.println(sum);
    }
}