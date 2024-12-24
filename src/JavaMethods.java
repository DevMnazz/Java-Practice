public class JavaMethods {
    public static void main(String[] args) {

        String[] questions = new String[3];
        questions[0] = "What is the name of the app where you can post 15-second videos?";
        questions[1] = "Which social media platform is known for disappearing stories?";
        questions[2] = "What is the term for a photo taken of oneself?";

        String[] answers = new String[3];
        answers[0] = "TikTok";
        answers[1] = "Snapchat";
        answers[2] = "Selfie";


        outputQuestionsAndAnswers(questions, answers);


    }

    public static void outputQuestionsAndAnswers(String[] questions, String[] answers) {
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println(answers[i]);
        }
    }

    public static int sum(int x, int y) {
        return x + y;
    }

}
