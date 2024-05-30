package com.Assignment4.A.goal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoalService {
    @Autowired
    GoalRepository goalRepository;

    public List<Goal> getAllGoalofuser(int userId) {
        return goalRepository.getbyuserId(userId);
    }

}
