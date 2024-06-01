package com.Assignment4.A.goal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/goals")
public class GoalController {
    @Autowired
    GoalService goalService;

    @GetMapping("/all")
    public String getAllGoals(Model model) {
        List<Goal> goals = goalService.getAllGoals();
        model.addAttribute("goals", goals);
        return "goals";
    }


    @PostMapping("/Create")
    public String createGoal(@ModelAttribute Goal goal, Model model) {
        Goal createdGoal = goalService.saveGoal(goal);
        model.addAttribute("goal", createdGoal);
        return "index";
    }


    @PutMapping("/update/{goalId}")
    public Goal updateGoal(@PathVariable int goalId, @RequestBody Goal goal) {
        Goal Goals = goalService.getGoal(goalId);
        if (Goals != null) {
            Goals.setTitle(goal.getTitle()); // This update the title
            Goals.setDetails(goal.getDetails()); // This add and also update details
            Goals.setTargetDate(goal.getTargetDate()); // This used for updating the target date
            Goals.setStatus(goal.getStatus()); // This update the status
            goalService.saveGoal(Goals); // Save the goal with updated information.
        }
        return Goals;
    }

    @DeleteMapping("/delete/{goalId}")
    public void deleteGoal(@PathVariable int goalId) { // This delete the exesting Goal
        goalService.deleteGoal(goalId);
    }

    @GetMapping("/user/{userId}")
    public List<Goal> getAllGoalsForUser(@PathVariable int userId) { // Get all goal of the user
        return goalService.getAllGoalofuser(userId);
    }

    @GetMapping("/{goalId}")
    public Goal getGoal(@PathVariable int goalId) { // Get the goal based on goal id
        return goalService.getGoal(goalId);
    }



}
