import java.util.Scanner;

class Box {
    int size;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int size   = sc.nextInt();
        sc.close();

        Box box = new Box();
        box.size   = size;
        System.out.println(box.size > 10 ? "BIG":"SMALL");
    }
}