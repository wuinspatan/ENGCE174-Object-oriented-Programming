import java.util.Scanner;

class Score {
    private int score;
    
    // put input age value to private int age;
    public void setScore(int score) {
        this.score = score;
    }
    // call age value for using 
    public int getScore() {
        return score;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score_in = sc.nextInt();
        sc.close();

        Score obj = new Score();
        obj.setScore(score_in);
        System.out.println(obj.getScore());
    }
}