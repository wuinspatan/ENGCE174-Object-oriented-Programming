import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        sc.close();
        
        int position = 0; // 0 ถ้าไม่พบ
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                position = i + 1; // ตำแหน่งเริ่มนับจาก 1
                break;
            }
        }

        System.out.println(position);
    }
}