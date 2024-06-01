package com.Assignment4.A.goal;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.*;
import java.util.Date;

    @Entity
    @Table(name = "Goal")
public class Goal {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int goalId;

        private int userId;

        @NonNull
        private String title;

        private String details;

        @NonNull
        private Date targetDate;

        @NonNull
        private String status;

        public Goal(){

        }
        public Goal(int goalId, int userId, @NonNull String title, String details, @NonNull Date targetDate, @NonNull String status) {
            this.goalId = goalId;
            this.userId = userId;
            this.title = title;
            this.details = details;
            this.targetDate = targetDate;
            this.status = status;
        }

        public int getGoalId() {
            return goalId;
        }

        public void setGoalId(int goalId) {
            this.goalId = goalId;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
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
        public Date getTargetDate() {
            return targetDate;
        }

        public void setTargetDate(@NonNull Date targetDate) {
            this.targetDate = targetDate;
        }

        @NonNull
        public String getStatus() {
            return status;
        }

        public void setStatus(@NonNull String status) {
            this.status = status;
        }

    }

