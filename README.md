# Diagrama de Classes do Projeto

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

    Task "1" --> "1..*" TaskRepository : uses
    TaskService "1" --> "1" TaskRepository : uses
    TaskController "1" --> "1" TaskService : uses
# To-Do List API

Este projeto é uma API REST desenvolvida em **Java** utilizando **Spring Boot** para gerenciar tarefas de uma lista de afazeres (To-Do List). A aplicação permite realizar operações de **CRUD** (Criar, Ler, Atualizar e Excluir) em tarefas.

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

## Como Rodar o Projeto

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/seuusuario/to-do-list-api.git

### 7. Teste a API com o Swagger

Para testar os endpoints de forma interativa, você pode usar o **Swagger**, que está integrado ao projeto.

- Acesse a documentação Swagger da API em: [http://localhost:8080/swagger-ui/](http://localhost:8080/swagger-ui/).
- Na interface do Swagger, você verá todos os endpoints disponíveis na API.
- Você poderá realizar requisições diretamente pela interface gráfica, como **GET**, **POST**, **PUT** e **DELETE**.

Isso facilita a interação com a API sem precisar de ferramentas externas, como o Postman, e permite testar os endpoints de forma rápida e prática.

