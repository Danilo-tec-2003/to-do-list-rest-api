# To-Do List API

Este projeto é uma **API REST** desenvolvida em **Java** utilizando **Spring Boot** para gerenciar tarefas de uma lista de afazeres (To-Do List). A aplicação permite realizar operações de **CRUD** (Criar, Ler, Atualizar e Excluir) em tarefas.

## Funcionalidades

- **Criar tarefa**: Permite criar uma nova tarefa com título, descrição e status de conclusão.
- **Listar tarefas**: Exibe todas as tarefas cadastradas.
- **Buscar tarefa por ID**: Permite buscar uma tarefa específica através do seu ID.
- **Atualizar tarefa**: Atualiza os detalhes de uma tarefa existente.
- **Deletar tarefa**: Exclui uma tarefa pelo ID.

## Tecnologias Utilizadas

- **Java 23**
- **Spring Boot**
- **Spring Data JPA**
- **Swagger**
- **H2 Database**

## Diagrama de Classes do Projeto

Aqui está o diagrama de classes representando as principais entidades e interações do seu projeto:

```mermaid
classDiagram
    class Task {
        +Long id
        +String title
        +String description
        +boolean completed
        +getId()
        +getTitle()
        +getDescription()
        +isCompleted()
        +setId()
        +setTitle()
        +setDescription()
        +setCompleted()
    }

    class TaskRepository {
        +findAll()
        +findById(id: Long)
        +save(task: Task)
        +delete(task: Task)
    }

    class TaskService {
        +getAllTask()
        +getTaskById(id: Long)
        +createTask(task: Task)
        +updateTask(id: Long, taskDetails: Task)
        +deleteTask(id: Long)
    }

    class TaskController {
        +getAllTask()
        +getTaskById(id: Long)
        +createTask(task: Task)
        +updateTask(id: Long, taskDetails: Task)
        +deleteTask(id: Long)
    }

    TaskRepository "1" --> "1..*" Task : manages
    TaskService "1" --> "1" TaskRepository : uses
    TaskController "1" --> "1" TaskService : uses
