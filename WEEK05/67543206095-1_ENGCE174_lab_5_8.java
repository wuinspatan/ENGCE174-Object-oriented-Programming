import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] text = new String[3];
        for (int i = 0; i < text.length; i++) {
            text[i] = sc.next();
        }

        String find = sc.next();

        boolean found = false;
        for (int i = 0; i < text.length; i++) {
            if (text[i].equals(find)) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "FOUND" : "NOT FOUND");
        sc.close();
    }
}