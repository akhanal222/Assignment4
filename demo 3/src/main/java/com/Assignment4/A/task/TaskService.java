

package com.Assignment4.A.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Autowired
    TaskRepository taskRepository;

    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    public Task updateTask(int taskId, Task task) {
        Task existingTask = taskRepository.findById(taskId).orElse(null);
        if (existingTask != null) {
            existingTask.setTitle(task.getTitle());
            existingTask.setDetails(task.getDetails());
            existingTask.setStatus(task.getStatus());
            taskRepository.save(existingTask);
        }
        return existingTask;
    }

    public void deleteTask(int taskId) {
        taskRepository.deleteById(taskId);
    }

    public Task getTask(int taskId) {
        return taskRepository.findById(taskId).orElse(null);
    }

}

