import java.util.Scanner; 

class User {
    String name;
}

class Member extends User { }

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();     
        sc.close();
        Member m = new Member();
        m.name = input;                
        System.out.println(m.name);   
    }
}