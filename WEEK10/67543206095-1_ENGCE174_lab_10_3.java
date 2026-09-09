import java.util.Scanner;

class Student {
    private String name;

    public void setName(String name_set) {
        this.name = name_set;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name_input = sc.next();
        sc.close();
        Student obj = new Student();
        obj.setName(name_input);
        System.out.print(obj.getName());\
    }
}