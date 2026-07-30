import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] grid = new int[2][2];
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 2; col++) {
                grid[row][col] = sc.nextInt();
            }
        }
        sc.close();

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 2; col++) {
                System.out.print(grid[row][col] + " ");
            }
            System.out.println();
        }
    }
}