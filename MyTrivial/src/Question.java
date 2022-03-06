public class Question {
    private String theme;
    private String statement;
    private boolean rightAnswer;
    private boolean userAnswer;
    private int punctuation;

    public Question(String theme, String statement, boolean rightAnswer, int punctuation) {
        this.theme = theme;
        this.statement = statement;
        this.rightAnswer = rightAnswer;
        this.userAnswer = false;
        this.punctuation = punctuation;
    }

    public String getTheme() {
        return theme;
    }

    public String getStatement() {
        return statement;
    }

    public boolean isRightAnswer() {
        return rightAnswer;
    }

    public boolean isUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(boolean userAnswer) {
        this.userAnswer = userAnswer;
    }

    public int getPunctuation(){
        return punctuation;
    }

    @Override
    public String toString() {
        return "Question{" +
                "theme='" + theme + '\'' +
                ", statement='" + statement + '\'' +
                ", rightAnswer=" + rightAnswer +
                ", userAnswer=" + userAnswer +
                ", punctuation=" + punctuation +
                '}';
    }
}
