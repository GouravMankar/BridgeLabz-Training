package com.edumentor;
public class Quiz {
    private String question;
    private String answer;
    private int score;

    public Quiz(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public void submitAnswer(String ans) {
        if (answer.equalsIgnoreCase(ans)) score = 100;
        else score = 0;
    }

    public int getScore() { return score; }
}
