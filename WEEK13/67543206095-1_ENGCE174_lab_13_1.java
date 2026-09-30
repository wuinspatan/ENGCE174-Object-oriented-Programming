import java.util.Scanner;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // รับค่าจำนวนเต็ม 3 จำนวน
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        Calculator calc = new Calculator();

        // แสดงผลลัพธ์ add(a, b) และ add(a, b, c) คนละบรรทัด
        System.out.println(calc.add(num1, num2));
        System.out.println(calc.add(num1, num2, num3));

        scanner.close();
    }
}