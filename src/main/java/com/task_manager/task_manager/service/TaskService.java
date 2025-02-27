package com.task_manager.task_manager.service;

import com.task_manager.task_manager.model.Task;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TaskService {

    public Optional<Task> getTask(Long id){
        return Optional.of(new Task());
    }

    public Long addTask(Task task){
        return null;
    }

    public void deleteTask(Long id){
        return;
    }
}
