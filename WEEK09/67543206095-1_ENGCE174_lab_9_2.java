import java.util.Scanner;

class Book {
    String title;
    public static void main(String[] args) {
        Scanner sc   = new Scanner(System.in);    // create sc for input 
        String title = sc.next();               // input book's title 
        sc.close();                             // closing input
        Book obj  = new Book();                  // create object 
        obj.title = title;                      // assing string value to obj title 
        System.out.println(obj.title);          // display obj.title value
    }
}