package com.example.controller;

import com.example.service.TaskService;
import com.example.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import java.util.List;

@Controller
public class TaskController {
    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    public void addTask(String description) {
        taskService.addTask(description);
        System.out.println("Задача добавлена: " + description);
    }

    public void showTasks() {
        List<Task> tasks = taskService.getAllTasks();
        tasks.forEach(System.out::println);
    }
}