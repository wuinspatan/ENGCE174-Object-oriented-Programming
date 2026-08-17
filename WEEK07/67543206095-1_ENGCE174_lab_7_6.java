import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // อ่านค่าเข้า Array 2x2
        Scanner sc = new Scanner(System.in);
        int[][] grid = new int[2][2];

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                grid[row][col] = sc.nextInt();
            }
        }
        sc.close();

        // Display array using nested loop
        for(int row = 0 ; row < 2 ; row++) {
            for(int col = 0; col < 2 ; col++) {
                System.out.print(grid[row][col]);
                // เว้นวรรคเฉพาะตอนที่ยังไม่ใช่ตัวสุดท้ายของบรรทัด 
                if (col < 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}