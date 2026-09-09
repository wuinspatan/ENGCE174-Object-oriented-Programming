import java.util.Scanner;

class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getBook(String title_get) {
        return title_get;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title_in = sc.next();
        sc.close();

        Book obj = new Book(title_in);
        System.out.println(obj.getBook(title_in));
    }
}