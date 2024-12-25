import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class TriviaGameTwo {
    public static void main(String[] args) throws InterruptedException {
        int score = 0;
        String name = "";
        Random rand = new Random();
        int random = 0;
        Scanner scanner = new Scanner(System.in);

        String[] que0 = new String[5];
        que0[0] = "what does 'op' mean?";
        que0[1] = "When was Google founded?";
        que0[2] = "When was Apple founded?";
        que0[3] = "When was Amazon founded?";
        que0[4] = "When was Facebook founded?";

        String[] que1 = new String[5];
        que1[0] = "What is the capital of France?";
        que1[1] = "What is the capital of Germany?";
        que1[2] = "What is the capital of Italy?";
        que1[3] = "What is the capital of Spain?";
        que1[4] = "What is the capital of Portugal?";

        String[] que2 = new String[5];
        que2[0] = "What is the most popular sport in the world?";
        que2[1] = "What is the most popular sport in the USA?";
        que2[2] = "What is the most popular sport in the UK?";
        que2[3] = "What is the most popular sport in Australia?";
        que2[4] = "What is the most popular sport in Brazil?";


        String[] ans0 = new String[5];
        ans0[0] = "having power in java and mcpe";
        ans0[1] = "1998";
        ans0[2] = "1976";
        ans0[3] = "1994";
        ans0[4] = "2004";

        String[] ans1 = new String[5];
        ans1[0] = "Paris";
        ans1[1] = "Berlin";
        ans1[2] = "Rome";
        ans1[3] = "Madrid";
        ans1[4] = "Lisbon";

        String[] ans2 = new String[5];
        ans2[0] = "Soccer";
        ans2[1] = "American Football";
        ans2[2] = "Soccer";
        ans2[3] = "Cricket";
        ans2[4] = "Soccer";

        System.out.println("Welcome to Trivia 2.0!");
        System.out.println("Please enter your name: ");
        name = scanner.nextLine();
        System.out.println("Welcome to the trivia game, " + name + "!");
        System.out.println("Selecting your cetegory...");
        Thread.sleep(1000);
        random = rand.nextInt(3);
        System.out.println("Category Selected!");

        questionAsking(que0, que1, que2, ans0, ans1, ans2, random, score);
        System.out.println("That's Game!");
        Thread.sleep(1000);
        System.out.println(name + ", Your Score Is " + score);
        System.out.println("Play Again?  y/n");
        String playAgain = scanner.nextLine();
        if (Objects.equals(playAgain, "y")) {
            main(args);
        } else {
            System.out.println("Goodbye you filthy animal!");
        }

    }

    public static void questionAsking(String[] que0, String[] que1, String[] que2, String[] ans0, String[] ans1, String[] ans2, int random, int score) {
        String answer = "";
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < que0.length; i++) {
            if (random == 0) {
                System.out.println(que0[i]);
                answer = scanner.nextLine();
                if (Objects.equals(answer, ans0[i])) {
                    score++;
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect!");
                }
            } else if (random == 1) {
                System.out.println(que1[i]);
                answer = scanner.nextLine();
                if (Objects.equals(answer, ans1[i])) {
                    score++;
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect!");
                }

            } else if (random == 2) {
                System.out.println(que2[i]);
                answer = scanner.nextLine();
                if (Objects.equals(answer, ans2[i])) {
                    score++;
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect!");
                }

            }
        }
    }

}
