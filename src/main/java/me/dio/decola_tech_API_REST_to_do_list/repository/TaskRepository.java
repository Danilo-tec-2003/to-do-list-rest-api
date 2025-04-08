package me.dio.decola_tech_API_REST_to_do_list.repository;

import me.dio.decola_tech_API_REST_to_do_list.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Interface que estende JpaRepository e fornece os métodos de acesso ao banco de dados para tarefas.
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
//aqui está vazio pois o Spring Data JPÁ jé fornece os métodos básicos como: save(), findById(), findAll(), deleteById(), etc...
}
