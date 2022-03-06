import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Question> questions = buildQuestionList();

        getUserAnswer(questions);

        int counterRightAnswers = calculateNumberRightAnswers(questions);
        int score = calculateScore(questions);

        showTheResults(questions, counterRightAnswers, score);

    }

    private static void showTheResults(List<Question> questions, int counterRightAnswer, int score) {

        System.out.println(" The total number of correct answers is: "
                + counterRightAnswer + ". Total number of questions:"
                + questions.size() + " . ");
        System.out.println(" Your final score is: " + score + " . ");
    }

    private static int calculateScore(List<Question> questions) {

        int score = 0;

        for(int i = 0; i < questions.size(); i++) {
            Question currentQuestion = questions.get(i);
            if (currentQuestion.isUserAnswer() == currentQuestion.isRightAnswer()) {
                score = score + currentQuestion.getPunctuation();
            }
        }
        return score;
    }

    private static void getUserAnswer(List<Question> questions) {
        for (int i = 0; i < questions.size(); i++) {

            Question currentQuestion = questions.get(i);

            System.out.println(currentQuestion.getStatement());
            System.out.println(" Answer True/False (T/F) ");
            Scanner sc = new Scanner(System.in);
            String text = sc.nextLine();

            boolean currentUserAnswer = text.equalsIgnoreCase("T");

            currentQuestion.setUserAnswer(currentUserAnswer);

            if (currentUserAnswer == currentQuestion.isRightAnswer()) {
                System.out.println( " congratulations, you got it right " );
            } else {
                System.out.println(" Failed attempt ");
            }
        }
    }

    private static int calculateNumberRightAnswers(List<Question> questions) {

        int counterRightAnswers = 0;

        for (int i = 0; i < questions.size(); i++) {
            Question currentQuestion = questions.get(i);
            if (currentQuestion.isUserAnswer() == currentQuestion.isRightAnswer()) {
                counterRightAnswers++;
            }
        }
        return counterRightAnswers;

    }

    private static List<Question> buildQuestionList() {
        List<Question> questions = new ArrayList<>();

        questions.add(new Question("History", "What is the name of the 1805 sea battle, Battle of Trafalgar?", true, 3));
        questions.add(new Question("History", "Who founded the city of Rome according to legend, the brothers Romulus and Remus?", true, 1));
        questions.add(new Question("Geografia", "The capital of Portugal is Lisbon", true, 4));
        questions.add(new Question("Geografia", "The capital of Germany is London", false, 5));
        questions.add(new Question("Nature", "Are there luminescent plants, like fireflies?", true, 3));

        return questions;
    }
}
