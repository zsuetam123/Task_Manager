package com.task_manager.task_manager.controller;

import com.task_manager.task_manager.model.Task;
import com.task_manager.task_manager.service.TaskService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public Long addTask(@RequestBody Task task) {
        return this.taskService.addTask(task);
    }

    @GetMapping("/{id}")
    public Task findTask(@PathVariable("id") Long taskId) {
        Optional<Task> task = this.taskService.getTask(taskId);
        return task.orElse(null);
    }

    @PutMapping
    public Task updateTask(@RequestBody Task task) {
        return null;
    }

/*    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable Long id) {
        return this.taskService.deleteTask(id);
    }*/

}
