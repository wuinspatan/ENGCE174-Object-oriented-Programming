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

        System.out.println(words.size());
    }
}