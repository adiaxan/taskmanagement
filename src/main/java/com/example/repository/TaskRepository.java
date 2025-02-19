
package com.example.repository;

import com.example.model.Task;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TaskRepository {
    private final List<Task> tasks = new ArrayList<>();
    private int nextId = 1;

    public List<Task> getAllTasks() {
        return tasks;
    }

    public void addTask(String description) {
        tasks.add(new Task(nextId++, description));
    }

    public Task findTaskById(int id) {
        return tasks.stream()
                .filter(task -> task.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
