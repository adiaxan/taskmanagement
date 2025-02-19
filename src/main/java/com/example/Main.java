
package com.example;

import com.example.config.AppConfig;
import com.example.controller.TaskController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        TaskController taskController = context.getBean(TaskController.class);

        taskController.addTask("Выучить Spring");
        taskController.addTask("Разобраться с GitHub");
        taskController.showTasks();
    }
}
