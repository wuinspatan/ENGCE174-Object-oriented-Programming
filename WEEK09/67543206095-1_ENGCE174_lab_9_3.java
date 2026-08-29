import java.util.Scanner;

class Car {
    String brand;
    int year;

    public static void main(String[] args) {
        Scanner sc   = new Scanner(System.in);

        String brand = sc.next();
        int    year  = sc.nextInt();
        sc.close();
        Car car      = new Car();
        car.brand    = brand;
        car.year     = year;
        
        System.out.println(car.brand);
        System.out.println(car.year);

    }
}