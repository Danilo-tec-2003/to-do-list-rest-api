# 📝 To-Do List API

Projeto desenvolvido como parte do bootcamp **Decola Tech** para demonstrar o uso de Java com Spring Boot na criação de uma API RESTful.

---

## 📌 Descrição

A **To-Do List API** é uma aplicação backend que permite gerenciar uma lista de tarefas de forma simples e eficiente. Com ela, é possível realizar operações CRUD (Criar, Ler, Atualizar e Deletar) sobre tarefas, utilizando boas práticas de desenvolvimento com o ecossistema Spring.

---

## 🚀 Tecnologias Utilizadas

- ☕ **Java 17**
- 🌱 **Spring Boot**
- 🗃️ **Spring Data JPA**
- 🐘 **H2 Database** (em memória, para testes)
- 📄 **Swagger / OpenAPI** (para documentação automática da API)
- 📦 **Maven** (gerenciador de dependências e build)

---

## ✅ Funcionalidades

| Recurso             | Descrição                                                                 |
|---------------------|---------------------------------------------------------------------------|
| ✅ Criar Tarefa       | Cria uma nova tarefa com título, descrição e status de conclusão.         |
| 📋 Listar Tarefas     | Retorna todas as tarefas cadastradas.                                     |
| 🔍 Buscar por ID      | Recupera uma tarefa específica com base no seu identificador único.       |
| ✏️ Atualizar Tarefa   | Altera os dados de uma tarefa existente.                                  |
| ❌ Excluir Tarefa     | Remove uma tarefa da lista com base no ID.                                |

---

## 🛠️ Como Executar o Projeto Localmente

### 🔁 Clonar o Repositório

```bash
git clone https://github.com/Danilo-tec-2003/to-do-list-rest-api.git
cd to-do-list-rest-api
⚙️ Configuração Padrão (H2 Database)
O projeto já está pronto para rodar com banco de dados H2 (em memória), ideal para testes e desenvolvimento local.

application.properties
properties
Copiar
Editar
spring.datasource.url=jdbc:h2:mem:todo_db
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
Acesse o console do H2 em:
📍 http://localhost:8080/h2-console
(JDBC URL: jdbc:h2:mem:todo_db)

▶️ Executar o Projeto
bash
Copiar
Editar
mvn clean install
mvn spring-boot:run
A aplicação estará disponível em:
📍 http://localhost:8080

📘 Documentação da API
A API possui documentação interativa gerada automaticamente pelo Swagger:

🔗 http://localhost:8080/swagger-ui.html

📁 Estrutura do Projeto
bash
Copiar
Editar
to-do-list-rest-api/
├── src/
│   ├── main/
│   │   ├── java/me/dio/decola_tech_API_REST_to_do_list/
│   │   │   ├── controller/   # Endpoints da API (REST Controllers)
│   │   │   ├── dto/          # Objetos de transferência de dados (TaskDTO)
│   │   │   ├── service/      # Regras de negócio (TaskService)
│   │   │   ├── model/        # Entidades JPA (Task)
│   │   │   └── repository/   # Interfaces de persistência (TaskRepository)
│   ├── test/                 # Testes automatizados (unitários e integração)
├── pom.xml                   # Gerenciador de dependências Maven
├── README.md                 # Documentação do projeto

👨‍💻 Autor
Desenvolvido por Danilo Mendes 
📧 danilodev.br@gmail.com
