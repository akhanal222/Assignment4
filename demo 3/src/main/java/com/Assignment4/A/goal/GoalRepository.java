package com.Assignment4.A.goal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

    @Repository
    public interface GoalRepository extends JpaRepository< Goal, Integer> {
        @Query(value = "SELECT g FROM Goal g WHERE g.userId = :userId" ,nativeQuery = true)
       public List<Goal> getbyuserId(int userId);
    }

