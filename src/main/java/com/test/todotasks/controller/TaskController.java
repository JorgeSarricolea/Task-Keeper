package com.test.todotasks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.test.todotasks.model.Task;
import com.test.todotasks.service.TaskService;

@Controller
public class TaskController {

    @Autowired
    private TaskService taskService; // Inject the TaskService to handle business logic

    /**
     * Handle the root URL ("/") and return the home view.
     * @return the name of the home view template
     */
    @GetMapping("/")
    public String home() {
        return "home";
    }

    /**
     * Show the form for adding a new task.
     * @param model the model to pass data to the view
     * @return the name of the add-task view template
     */
    @GetMapping("/add-task")
    public String showAddTaskForm(Model model) {
        model.addAttribute("task", new Task());
        return "add-task";
    }

    /**
     * Handle the submission of the add task form.
     * @param task the Task object populated from the form
     * @return a redirect to the list of tasks
     */
    @PostMapping("/add-task")
    public String addTask(Task task) {
        taskService.saveTask(task);
        return "redirect:/tasks";
    }

    /**
     * Display the list of all tasks.
     * @param model the model to pass data to the view
     * @return the name of the tasks view template
     */
    @GetMapping("/tasks")
    public String listTasks(Model model) {
        model.addAttribute("tasks", taskService.getAllTasks());
        return "tasks";
    }

    /**
     * Show the form for editing an existing task.
     * @param id the ID of the task to edit
     * @param model the model to pass data to the view
     * @return the name of the edit-task view template
     */
    @GetMapping("/edit-task/{id}")
    public String showEditTaskForm(@PathVariable("id") Long id, Model model) {
        Task task = taskService.getTaskById(id);
        model.addAttribute("task", task);
        return "edit-task";
    }

    /**
     * Handle the submission of the edit task form.
     * @param id the ID of the task being edited
     * @param task the Task object populated from the form
     * @return a redirect to the list of tasks
     */
    @PostMapping("/edit-task/{id}")
    public String editTask(@PathVariable("id") Long id, Task task) {
        task.setId(id);
        taskService.updateTask(task);
        return "redirect:/tasks";
    }

    /**
     * Handle the deletion of a task.
     * @param id the ID of the task to delete
     * @return a redirect to the list of tasks
     */
    @GetMapping("/delete-task/{id}")
    public String deleteTask(@PathVariable("id") Long id) {
        taskService.deleteTask(id);
        return "redirect:/tasks";
    }
}
