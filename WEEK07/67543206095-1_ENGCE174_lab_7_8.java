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
        int target = sc.nextInt();
        sc.close();

        // output FOUND target
        boolean found = true;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == target) {
                    found = true;
                    break;
                } else {
                    found = false;
                }
            }
        }
        System.out.print(found ? "FOUND" : "NOT FOUND");
    }
}