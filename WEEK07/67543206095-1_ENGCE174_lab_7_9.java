import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] grid = new String[2][2];
        
        // input data 
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                grid[row][col] = sc.next();
            }
        }
        String target = sc.next();
        sc.close();
        boolean found = true;
        int count = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col].equals(target)) {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
