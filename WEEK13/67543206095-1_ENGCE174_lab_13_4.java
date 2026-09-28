import java.util.Scanner;

class Vehicle {
    void move() {
        System.out.println("Vehicle");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vehicle v = new Car(sc.next());
        v.move();

        sc.close();
    }
}

class Car extends Vehicle {
    String text;

    Car(String text) {
        this.text = text;
    }

    @Override
    void move() {
        System.out.println(text);
    }
}