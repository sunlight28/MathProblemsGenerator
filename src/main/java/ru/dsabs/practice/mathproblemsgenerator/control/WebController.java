package ru.dsabs.practice.mathproblemsgenerator.control;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.dsabs.practice.mathproblemsgenerator.model.Difficulty;
import ru.dsabs.practice.mathproblemsgenerator.model.MathProblem;
import ru.dsabs.practice.mathproblemsgenerator.model.ProblemType;
import ru.dsabs.practice.mathproblemsgenerator.service.MathService;

@Controller
public class WebController {
    @Autowired
    private MathService mathService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("problemTypes", ProblemType.values());
        model.addAttribute("difficulties", Difficulty.values());
        return "index";
    }

    @GetMapping("/problem")
    public String getProblem(
            @RequestParam ProblemType type,
            @RequestParam Difficulty difficulty,
            Model model
    ) {
        MathProblem problem = mathService.generateProblem(type, difficulty);
        model.addAttribute("problem", problem);
        return "problem";
    }
}
