import java.util.Scanner;

class Box {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value_in = sc.nextInt();
        sc.close();

        Box obj = new Box();
        obj.setValue(value_in);
        System.out.print(obj.getValue() > 10 ? "BIG":"SMALL");
    }
}