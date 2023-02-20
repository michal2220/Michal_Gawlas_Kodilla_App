package com.crud.tasks.controller;

import com.crud.tasks.domain.Task;
import com.crud.tasks.domain.TaskDto;
import com.crud.tasks.mapper.TaskMapper;
import com.crud.tasks.service.DbService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/tasks")
@RequiredArgsConstructor
public class TaskController {

    private final DbService service;
    private final TaskMapper taskMapper;

    @Autowired

    @GetMapping
    public List<TaskDto> getTasks(){
        List<Task> tasks = service.getAllTasks();
        return taskMapper.mapToTaskDoList(tasks);
    }

    @GetMapping(value = "{taskId}")
    public TaskDto getTask(@PathVariable Long taskId){
        return new TaskDto(1L, "test title", "test_content");
    }

    @DeleteMapping
    public void deleteTask (Long taskId){

    }

    @PutMapping(value = "{taskDto}")
    public TaskDto updateTask(@PathVariable TaskDto taskDto){
        return new TaskDto(1L, "Edited test title", "Test content");
    }

    @PostMapping
    public void createTask(TaskDto taskDto){

    }
}
