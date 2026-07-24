import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] tokens = line.trim().split("\\s+");

        int n = tokens.length - 1;       
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = tokens[i];
        }
        String target = tokens[n];       

        int count = 0;
        for (String word : words) {
            if (word.equals(target)) {   
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}