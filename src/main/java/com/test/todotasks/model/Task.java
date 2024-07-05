package com.test.todotasks.model;

import java.time.LocalDate;

public class Task {
    private Long id;
    private String name;
    private String description;
    private LocalDate startDate;

    // Getter for the task ID
    public Long getId() {
        return id;
    }

    // Setter for the task ID
    public void setId(Long id) {
        this.id = id;
    }

    // Getter for the task name
    public String getName() {
        return name;
    }

    // Setter for the task name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for the task description
    public String getDescription() {
        return description;
    }

    // Setter for the task description
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter for the task start date
    public LocalDate getStartDate() {
        return startDate;
    }

    // Setter for the task start date
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
}
