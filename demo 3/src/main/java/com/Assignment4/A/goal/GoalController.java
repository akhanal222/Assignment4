package com.Assignment4.A.goal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/goals")
public class GoalController {
    @Autowired
    GoalService goalService;

    @GetMapping("/{userId}")
    public String viewAllGoalsofUser(@PathVariable int userId, Model model){

        return "";
    }

    @GetMapping("/Update")
    public String UpdateGoal(@PathVariable Goal goal){

        return "";
    }


}
