import java.util.Scanner;

class Vehicle {
    public void move(String text) {
        System.out.println(text);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        sc.close();

        Car car = new Car();
        car.move(text); //sout
    }
}

class Car extends Vehicle { }