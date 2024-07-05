package com.test.todotasks.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.test.todotasks.model.Task;

@Mapper
public interface TaskMapper {
    List<Task> findAll();
    Task findById(Long id);
    void insert(Task task);
    void update(Task task);
    void delete(Long id);
}
