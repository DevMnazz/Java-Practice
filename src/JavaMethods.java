public class JavaMethods {
    public static void main(String[] args) {

        String[] questions = new String[3];
        questions[0] = "What is the capital of France?";
        questions[1] = "What is the capital of Germany?";
        questions[2] = "What is the capital of Italy?";

        String[] answers = new String[3];
        answers[0] = "Paris";
        answers[1] = "Berlin";
        answers[2] = "Rome";

        outputQuestionsAndAnswers(questions, answers);
        System.out.println(sum(5, 3));

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
