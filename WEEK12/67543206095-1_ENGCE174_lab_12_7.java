import java.util.Scanner;

class Item {
    public void showName(String name) {
        System.out.print(name);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();
        Book book = new Book();
        book.showName(input);
    }
}

class Book extends Item { } 