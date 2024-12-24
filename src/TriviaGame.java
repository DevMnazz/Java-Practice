import java.util.Objects;
import java.util.Scanner;

public class TriviaGame {
    public static void main(String[] args) {

        int score = 0;
        String name = "";
        String userAnswer = "";
        Scanner scanner = new Scanner(System.in);

        String[] questions = new String[10];
        questions[0] = "What is the name of the app where you can post 15-second videos?";
        questions[1] = "Which social media platform is known for disappearing stories?";
        questions[2] = "What is the term for a photo taken of oneself?";
        questions[3] = "Which app is known for its 'For You' page?";
        questions[4] = "What is the name of the popular online multiplayer game with crewmates and impostors?";
        questions[5] = "Which platform is known for its 'streaks' feature?";
        questions[6] = "What is the name of the virtual currency used in Fortnite?";
        questions[7] = "Which app is known for its 'filters' and 'lenses'?";
        questions[8] = "What is the name of the popular dance challenge app?";
        questions[9] = "Which platform is known for its 'tweets'?";

        String[] answers = new String[10];
        answers[0] = "TikTok";
        answers[1] = "Snapchat";
        answers[2] = "Selfie";
        answers[3] = "TikTok";
        answers[4] = "Among Us";
        answers[5] = "Snapchat";
        answers[6] = "V-Bucks";
        answers[7] = "Snapchat";
        answers[8] = "TikTok";
        answers[9] = "Twitter";

        System.out.println("Enter your name: ");
        name = scanner.nextLine();

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            userAnswer = scanner.nextLine();
            if ((Objects.equals(userAnswer, answers[i]))) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect!");
            }

        }

        System.out.println("That's Game!");
        System.out.println(name + ", Your Score Is " + score);

    }

}
