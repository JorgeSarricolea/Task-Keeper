package com.test.todotasks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.todotasks.model.Task;
import com.test.todotasks.repository.TaskMapper;

@Service // Marks this class as a Spring service
public class TaskService {

    @Autowired // Automatically injects the TaskMapper dependency
    private TaskMapper taskMapper;

    // Retrieves all tasks from the database
    public List<Task> getAllTasks() {
        return taskMapper.findAll();
    }

    // Retrieves a task by its ID from the database
    public Task getTaskById(Long id) {
        return taskMapper.findById(id);
    }

    // Saves a new task to the database
    public void saveTask(Task task) {
        taskMapper.insert(task);
    }

    // Updates an existing task in the database
    public void updateTask(Task task) {
        taskMapper.update(task);
    }

    // Deletes a task by its ID from the database
    public void deleteTask(Long id) {
        taskMapper.delete(id);
    }
}
