import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a') {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}