package com.task_manager.task_manager.service;

import com.task_manager.task_manager.model.Task;
import com.task_manager.task_manager.repository.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TaskService {

    //TODO Co powinny zwracać takie metody?

    @Autowired
    private TaskRepo taskRepo;

    public Optional<Task> getTask(Long taskId) {
        return this.taskRepo.findById(taskId);
    }

    public Long addTask(Task task) {
        return this.taskRepo.save(task).getId();
    }

    public void deleteTask(Long taskId) {
        this.taskRepo.deleteById(taskId);
    }

    public Long updateTask(Task task) {
        return this.taskRepo.save(task).getId();
    }
}
