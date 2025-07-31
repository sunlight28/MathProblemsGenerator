package ru.dsabs.practice.mathproblemsgenerator.model;

public enum ProblemType {
    ADDITION("Сложение"),
    SUBTRACTION("Вычитание"),
    MULTIPLICATION("Умножение"),
    DIVISION("Деление"),
    EQUATION("Уравнение");

    private final String russianName;

    ProblemType (String russianName) {
        this.russianName = russianName;
    }

    public String getRussianName() {
        return russianName;
    }
}
