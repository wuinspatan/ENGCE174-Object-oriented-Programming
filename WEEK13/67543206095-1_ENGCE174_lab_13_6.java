import java.util.Scanner;

class Circle extends Shape {
    String text;

    Circle(String text) {
        this.text = text;
    }

    @Override
    void show() {
        System.out.println(text);
    }
}

class Shape {
    void show() {
        System.out.println("Shape");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Shape s = new Circle(sc.next());
        s.show();

        sc.close();
    }
}