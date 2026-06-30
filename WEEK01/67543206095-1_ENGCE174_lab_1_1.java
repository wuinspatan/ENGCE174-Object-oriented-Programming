import java.util.Scanner;

class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            int age = Integer.parseInt(sc.nextLine());
            System.out.println("Hello " + name + ", you are " + age + " years old.");
    }
}