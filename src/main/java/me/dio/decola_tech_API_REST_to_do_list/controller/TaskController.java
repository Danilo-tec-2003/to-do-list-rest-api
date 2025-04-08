package me.dio.decola_tech_API_REST_to_do_list.controller;

import jakarta.validation.Valid;
import me.dio.decola_tech_API_REST_to_do_list.dto.TaskDTO;
import me.dio.decola_tech_API_REST_to_do_list.model.Task;
import me.dio.decola_tech_API_REST_to_do_list.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

// Controlador REST que expõe os endpoints da API para gerenciar tarefas (CRUD).

@RestController
@RequestMapping("api/tasks")
public class TaskController {


    @Autowired
    private TaskService taskService;

    @GetMapping

    public ResponseEntity<List<Task>> getAllTask() {
        return ResponseEntity.ok(taskService.getAllTask());
    }


    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Long id) {
        Optional<Task> task = taskService.getTaskById(id);
        return task.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody @Valid TaskDTO taskDTO) {
        Task createdTask = taskService.createTask(taskDTO);
        return new ResponseEntity<>(createdTask, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody @Valid TaskDTO taskDTO) {
        Task updatedTask = taskService.updateTask(id, taskDTO);
        return ResponseEntity.ok(updatedTask);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return ResponseEntity.noContent().build();
    }
}
