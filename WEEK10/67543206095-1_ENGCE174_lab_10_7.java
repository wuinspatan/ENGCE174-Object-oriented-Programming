import java.util.Scanner;

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getNameUser() {
        return name;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name_user = sc.next();
        sc.close();

        User obj = new User(name_user);
        System.out.print(obj.getNameUser());
    }
}