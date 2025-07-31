package ru.dsabs.practice.mathproblemsgenerator.model;

public class MathProblemGenerator {
    public static MathProblem generate (ProblemType type, Difficulty difficulty) {
        return switch (type) {
            case EQUATION -> EquationGenerator.generateLinearEquation(difficulty.getMaxCoefficient(), difficulty);
            case MULTIPLICATION, DIVISION -> BasicProblemGenerator
                    .generateBasicProblem(difficulty.getMaxNumForDivisionAndMultiplication(), type, difficulty);
            default -> BasicProblemGenerator.generateBasicProblem(difficulty.getMaxNum(), type, difficulty);
        };
    }
}
