import java.util.Scanner;

class Message {
    void show() {
        System.out.println("Small");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Message m = (n > 10) ? new BigMessage() : new Message();
        m.show();

        sc.close();
    }
}

class BigMessage extends Message {
    @Override
    void show() {
        System.out.println("Big");
    }
}