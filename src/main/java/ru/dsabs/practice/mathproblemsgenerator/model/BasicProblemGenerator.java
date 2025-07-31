package ru.dsabs.practice.mathproblemsgenerator.model;

import java.util.Random;

public class BasicProblemGenerator {
    public static final Random RAND = new Random();

    public static MathProblem generateBasicProblem(int max, ProblemType type, Difficulty difficulty) {
        int a = RAND.nextInt(max) + 1;
        int b = RAND.nextInt(max) + 1;

        return switch (type) {
            case ADDITION -> new MathProblem(type, a + " + " + b + " = ?", a + b, difficulty);
            case SUBTRACTION -> new MathProblem(type, a + " - " + b + " = ?", a - b, difficulty);
            case MULTIPLICATION -> new MathProblem(type, a + " * " + b + " = ?", a * b, difficulty);
            case DIVISION -> new MathProblem(type, (a * b) + " / " + b + " = ?", a, difficulty);
            default -> throw new IllegalArgumentException("Unknown problem type");
        };
    }
}
