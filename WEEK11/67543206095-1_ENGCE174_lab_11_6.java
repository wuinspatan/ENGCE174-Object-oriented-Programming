import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        words.add(sc.next());
        words.add(sc.next());
        words.add(sc.next());
        String target = sc.next();
        sc.close();
        System.out.println(words.contains(target) ? "FOUND" : "NOT FOUND"); 
    }
    
}