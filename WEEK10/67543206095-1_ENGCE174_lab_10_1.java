import java.util.Scanner;

class Greeting {
    private String value;

    public Greeting(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = sc.next();
        sc.close();
        Greeting obj = new Greeting(value);
        System.out.println(obj.getValue());
    }
}