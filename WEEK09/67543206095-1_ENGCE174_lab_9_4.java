import java.util.Scanner;

class Rectangle {
    int area(int width, int heigh) {
        return width * heigh;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width  = sc.nextInt();
        int height = sc.nextInt();
        sc.close();

        // create Object
        Rectangle rect = new Rectangle();
        System.out.println(rect.area(width, height));
    }
}