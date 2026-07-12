import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // get string value
        String password = keyboard.nextLine();

        // checking password more than 8 character
        while (password.length() < 8) {
            password = keyboard.nextLine();
        }//end while
        
        System.out.println("Password accepted");
        keyboard.close();
    }
}