package com.test.todotasks.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.test.todotasks.model.Task;

@Mapper
public interface TaskMapper {
    List<Task> findAll();
    void insert(Task task);
}
