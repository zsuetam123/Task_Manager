package com.task_manager.task_manager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {

    @Id
    private Long id;
    private String name;
    private String email;
    private String password;

}
