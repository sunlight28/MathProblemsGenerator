package ru.dsabs.practice.mathproblemsgenerator.control;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.dsabs.practice.mathproblemsgenerator.dto.CheckRequest;
import ru.dsabs.practice.mathproblemsgenerator.dto.CheckResponse;
import ru.dsabs.practice.mathproblemsgenerator.model.Difficulty;
import ru.dsabs.practice.mathproblemsgenerator.model.MathProblem;
import ru.dsabs.practice.mathproblemsgenerator.model.ProblemType;
import ru.dsabs.practice.mathproblemsgenerator.service.MathService;


@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    private MathService mathService;


    @GetMapping("/generate")
    public MathProblem generate (
            @RequestParam(required = false, defaultValue = "MEDIUM") Difficulty difficulty,
            @RequestParam(required = false, defaultValue = "ADDITION") ProblemType problemType
    ) {
        return mathService.generateProblem(problemType, difficulty);
    }


    @PostMapping("/check")
    public CheckResponse checkAnswer(@RequestBody CheckRequest request) {
        boolean isCorrect = mathService.checkAnswer(request.getProblem(), request.getUserAnswer());
        return new CheckResponse(isCorrect);
    }
}
