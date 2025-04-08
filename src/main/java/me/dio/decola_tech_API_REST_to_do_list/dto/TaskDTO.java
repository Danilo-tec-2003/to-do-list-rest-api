package me.dio.decola_tech_API_REST_to_do_list.dto;
import lombok.Data;
import jakarta.validation.constraints.NotBlank;

@Data
// Objeto de transferência de dados usado para criar e atualizar tarefas com validação.
public class TaskDTO {

    @NotBlank(message = "O título é obrigatório")
    private String title;

    private String description;
    private boolean completed;
}
