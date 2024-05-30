package com.Assignment4.A.task;

import com.Assignment4.A.goal.Goal;
import jakarta.persistence.*;
import org.springframework.lang.NonNull;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int taskId;

    @ManyToMany
    @JoinTable(name = " GoalId")
    private Goal goalId;

    @NonNull
    private String title;


    private String details;

    @NonNull
    private String status;

    public Task(int taskId, Goal goal, @NonNull String title, String details, @NonNull String status) {
        this.taskId = taskId;
        this.goalId = goal;
        this.title = title;
        this.details = details;
        this.status = status;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public Goal getGoal() {
        return goalId;
    }

    public void setGoal(Goal goal) {
        this.goalId = goal;
    }

    @NonNull
    public String getTitle() {
        return title;
    }

    public void setTitle(@NonNull String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @NonNull
    public String getStatus() {
        return status;
    }

    public void setStatus(@NonNull String status) {
        this.status = status;
    }

}
