import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        words.add(sc.next());
        words.add(sc.next());
        words.add(sc.next());
        sc.close();
        words.set(1,"z");
        for (String word : words) { System.out.println(word); }
    }
}