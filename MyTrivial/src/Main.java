import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Question> questions = buildQuestionList();

        getUserAnswer(Questions);

        int counterRightAnswers = calculateNumberRightAnswers(questions);
        int score = calculateScore(questions);

        showTheResults(questions, counterRightAnswers, score);

    }

    private static void showTheResults(List<Question> questions, int counterRightAnswer, int score) {

        System.out.println(" The total number of correct answers is: " + counterRightAnswers + ". Total number of questions:" + questions.size() + " . ");
        System.out.println(" Your final score is: " + score + " . ");
    }




}
