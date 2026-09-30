import java.util.ArrayList;
import java.util.Scanner;

class Item {
    String name;
    Item(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(sc.next()));
        items.add(new Item(sc.next()));
        sc.close();

        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i).name);
            if (i < items.size() - 1) {
                System.out.println();
            }
        }
    } 
}