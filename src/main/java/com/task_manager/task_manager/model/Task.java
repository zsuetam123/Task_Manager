package com.task_manager.task_manager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Task {

    @Id
    private Long id;
    private String title;
    private String description;
    private String status;
    private String priority;
}
