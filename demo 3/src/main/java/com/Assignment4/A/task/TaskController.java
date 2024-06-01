/** package com.Assignment4.A.task;

public class TaskController {

}
 **/
package com.Assignment4.A.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    TaskService taskService;

    @PostMapping("/Create")
    public Task createTask(@RequestBody Task task) {
        return taskService.saveTask(task);
    }

    @PutMapping("/update/{taskId}")
    public Task updateTask(@PathVariable int taskId, @RequestBody Task task) {
        return taskService.updateTask(taskId, task);
    }

    @DeleteMapping("/delete/{taskId}")
    public void deleteTask(@PathVariable int taskId) {
        taskService.deleteTask(taskId);
    }

    @GetMapping("/{taskId}")
    public Task getTask(@PathVariable int taskId) {
        return taskService.getTask(taskId);
    }
}

