import java.util.Scanner;

class Item {
    String name;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String first_item    = sc.next();
        String second_item   = sc.next();
        sc.close();

        Item Item1 = new Item();
        Item Item2 = new Item();

        Item1.name   = first_item;
        Item2.name   = second_item;

        System.out.println(Item1.name);
        System.out.println(Item2.name);
    }
}