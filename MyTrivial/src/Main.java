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


}
