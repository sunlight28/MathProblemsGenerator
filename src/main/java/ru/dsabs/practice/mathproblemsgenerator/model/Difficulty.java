package ru.dsabs.practice.mathproblemsgenerator.model;

public enum Difficulty {
    EASY(10, "Лёгкая"),
    MEDIUM(50, "Средняя"),
    HARD(100, "Сложная");

    private final int maxNum;
    private final String russianName;

    Difficulty(int maxNum, String russianName) {
        this.maxNum = maxNum;
        this.russianName = russianName;
    }

    public String getRussianName() {
        return russianName;
    }

    public int getMaxNum() {
        return maxNum;
    }

    public int getMaxCoefficient() {
        return maxNum / 3;
    }

    public int getMaxNumForDivisionAndMultiplication() {
        return maxNum / 2;
    }
}


