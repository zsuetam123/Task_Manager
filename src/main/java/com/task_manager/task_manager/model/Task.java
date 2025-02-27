package com.task_manager.task_manager.model;

import lombok.Data;

@Data
public class Task {

    private Long id;
    private String title;
    private String description;
    private String status;
    private String priority;
}
