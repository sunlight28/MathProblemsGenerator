package ru.dsabs.practice.mathproblemsgenerator.model;


import java.util.Random;

public class EquationGenerator {
    private static final Random RAND = new Random();

    // ax + b = c
    // (c - b)/a = x
    public static MathProblem generateLinearEquation(int max, Difficulty difficulty) {
        int a = RAND.nextInt(max) + 1;
        int b = RAND.nextInt(max);
        int c = a * (RAND.nextInt(max) + 1) + b; //чтобы гарантировать целый x

        double answer = (double) (c - b) / a ;

        return new MathProblem(ProblemType.EQUATION, a + "x + " + b + " = " + c, answer, difficulty);
    }
}
