import java.util.Scanner;

class Shape {
    public void showType(String text) {
        System.out.println(text);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        sc.close();
        Circle circle = new Circle();
        circle.showType(text);
    }
}

class Circle extends Shape { }