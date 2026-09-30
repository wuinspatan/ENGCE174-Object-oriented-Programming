import java.util.Scanner;

class NumberBox {
    private int value;

    public NumberBox(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        sc.close();
        NumberBox obj = new NumberBox(value);
        System.out.print(obj.getValue());
    }
}