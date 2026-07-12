import java .util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String user = "admin";
        String pass = "9999";
        int i = 0;

        String get_u, get_p;
        do {
            i++;
            get_u = sc.nextLine();
            get_p = sc.nextLine();

            if (get_u.equals(user) && get_p.equals(pass)) {
                System.out.println("Login success");
                break;
            } else if (i == 3) {
                System.out.println("Login failed");
                break;
            }
        } while (i <= 3);
        sc.close();
    }
}