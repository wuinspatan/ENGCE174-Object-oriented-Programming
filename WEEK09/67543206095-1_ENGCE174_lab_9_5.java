import java.util.Scanner;

class Circle {
    int radius;

    void showRadius() {
        System.out.println(radius);
    }

    public static void main(String[] args) {

        Scanner sc    = new Scanner(System.in);
        int radius    = sc.nextInt();
        sc.close();

        Circle circle = new Circle();
        circle.radius = radius;

        circle.showRadius();
    }
}