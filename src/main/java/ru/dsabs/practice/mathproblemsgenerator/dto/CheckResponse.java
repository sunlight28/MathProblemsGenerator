package ru.dsabs.practice.mathproblemsgenerator.dto;

public class CheckResponse {
    private boolean correct;

    public CheckResponse(boolean correct) {
        this.correct = correct;
    }

    public boolean isCorrect() {
        return correct;
    }
}
