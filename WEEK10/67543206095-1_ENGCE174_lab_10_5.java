import java.util.Scanner;

class Person {
    private int age;
    
    // put input age value to private int age;
    public void setAge(int age) {
        this.age = age;
    }
    // call age value for using 
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age_in = sc.nextInt();
        sc.close();

        Person obj = new Person();
        obj.setAge(age_in);
        System.out.println(obj.getAge());
    }


}