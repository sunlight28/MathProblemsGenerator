package ru.dsabs.practice.mathproblemsgenerator.model;

public class MathProblem {
    private final ProblemType type;
    private final String question;
    private final double answer;
    private Difficulty difficulty;

    public MathProblem(ProblemType type, String question, double answer, Difficulty difficulty) {
        this.type = type;
        this.question = question;
        this.answer = answer;
        this.difficulty = difficulty;
    }

    public String getQuestion() {
        return question;
    }

    public double getAnswer() {
        return answer;
    }

    public ProblemType getType() {
        return type;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }
}
