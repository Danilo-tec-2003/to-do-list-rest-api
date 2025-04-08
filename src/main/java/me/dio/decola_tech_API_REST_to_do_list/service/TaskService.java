package me.dio.decola_tech_API_REST_to_do_list.service;

import me.dio.decola_tech_API_REST_to_do_list.dto.TaskDTO;
import me.dio.decola_tech_API_REST_to_do_list.model.Task;
import me.dio.decola_tech_API_REST_to_do_list.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// Classe de serviço que contém a lógica de negócio para manipulação de tarefas.
@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;


    public List<Task> getAllTask() {
        return taskRepository.findAll();
    }

    public Optional<Task> getTaskById(Long id) {
        return taskRepository.findById(id);
    }

    public Task createTask(TaskDTO taskDTO) {
        Task task = new Task();
        task.setTitle(taskDTO.getTitle());
        task.setDescription(taskDTO.getDescription());
        task.setCompleted(taskDTO.isCompleted());
        return taskRepository.save(task);
    }

    public Task updateTask(Long id, TaskDTO taskDTO) {
        Task task = taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
        task.setTitle(taskDTO.getTitle());
        task.setDescription(taskDTO.getDescription());
        task.setCompleted(taskDTO.isCompleted());
        return taskRepository.save(task);
    }

    public void deleteTask(Long id) {
        Task task = taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
        taskRepository.delete(task);
    }
}
