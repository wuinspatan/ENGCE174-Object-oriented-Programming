import java.util.Scanner;

class Car {
    private String brand;
    private int year;

    public Car(String brand_, int year_) {
        this.brand = brand_;
        this.year = year_;
    }

    public int getYear() { return year; }
    public String getBrand() { return brand; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String brand_in = sc.next();
        int year_in = sc.nextInt();
        sc.close();

        Car obj = new Car(brand_in, year_in);
        System.out.println(obj.getBrand());
        System.out.print(obj.getYear());
    }


}