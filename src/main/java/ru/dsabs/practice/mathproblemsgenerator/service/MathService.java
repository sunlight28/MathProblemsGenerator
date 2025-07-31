package ru.dsabs.practice.mathproblemsgenerator.service;


import org.springframework.stereotype.Service;
import ru.dsabs.practice.mathproblemsgenerator.model.Difficulty;
import ru.dsabs.practice.mathproblemsgenerator.model.MathProblem;
import ru.dsabs.practice.mathproblemsgenerator.model.MathProblemGenerator;
import ru.dsabs.practice.mathproblemsgenerator.model.ProblemType;

@Service
public class MathService {
    public MathProblem generateProblem(ProblemType type, Difficulty difficulty) {
        MathProblem problem = MathProblemGenerator.generate(type, difficulty);
        if (problem == null) {
            throw new IllegalStateException("Failed to generate problem");
        }
        return problem;
    }

    public boolean checkAnswer(MathProblem problem, double userAnswer) {
        return Math.abs(problem.getAnswer() - userAnswer) < 0.001;
    }
}
