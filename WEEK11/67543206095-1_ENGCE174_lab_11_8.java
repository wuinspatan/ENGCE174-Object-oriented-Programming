import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<>();
        words.add(sc.next());
        words.add(sc.next());
        words.add(sc.next());
        sc.close();

        words.remove(1);

        for (int i = 0; i < words.size(); i++) {
            System.out.print(words.get(i));
            if (i < words.size() - 1) {
                System.out.println();
            }
        }
    }
}