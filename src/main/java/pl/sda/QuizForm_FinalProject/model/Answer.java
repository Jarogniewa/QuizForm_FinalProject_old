package pl.sda.QuizForm_FinalProject.model;

public class Answer {
    public String content;
    public boolean correctness;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isCorrectness() {
        return correctness;
    }

    public void setCorrectness(boolean correctness) {
        this.correctness = correctness;
    }
}
