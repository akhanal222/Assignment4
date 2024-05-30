package com.Assignment4.A.task;

import com.Assignment4.A.goal.Goal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository< Task, String> {
    @Query(value = "..",nativeQuery = true)
   public List<Goal> getbyGoal(Goal goal);
}
