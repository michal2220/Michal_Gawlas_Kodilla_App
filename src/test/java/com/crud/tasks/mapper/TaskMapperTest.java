package com.crud.tasks.mapper;

import com.crud.tasks.domain.Task;
import com.crud.tasks.domain.TaskDto;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaskMapperTest {

    TaskMapper mapper = new TaskMapper();

    @Test
    void mapToTaskTest() {
        //Given
        TaskDto taskDto = new TaskDto(1L, "1", "1");

        //When
        Task testTask = mapper.mapToTask(taskDto);

        //Then
        assertEquals(1L, testTask.getId());
    }

    @Test
    void mapToTaskDtoTest() {
        //Given
        Task task = new Task(1L, "1", "1");

        //When
        TaskDto testTask = mapper.mapToTaskDto(task);

        //Then
        assertEquals(1L, testTask.getId());
    }

    @Test
    void mapToTaskDtoListTest() {
        //Given
        List<Task> taskList = new ArrayList<>();
        taskList.add(new Task(1L, "1", "1"));
        taskList.add(new Task(2L, "2", "2"));

        //When
        List<TaskDto> testTaskList = mapper.mapToTaskDtoList(taskList);

        //Then
        assertEquals(2, testTaskList.size());
    }


}