package ru.dsabs.practice.mathproblemsgenerator.dto;

import ru.dsabs.practice.mathproblemsgenerator.model.MathProblem;

public class CheckRequest {
    private MathProblem problem;
    private double userAnswer;

    public void setProblem(MathProblem problem) {
        this.problem = problem;
    }

    public void setUserAnswer(double userAnswer) {
        this.userAnswer = userAnswer;
    }

    public MathProblem getProblem() {
        return problem;
    }

    public double getUserAnswer() {
        return userAnswer;
    }
}
