package com.test.todotasks.service;

import com.test.todotasks.model.Task;
import com.test.todotasks.repository.TaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskMapper taskMapper;

    public List<Task> getAllTasks() {
        return taskMapper.findAll();
    }

    public void saveTask(Task task) {
        taskMapper.insert(task);
    }
}
