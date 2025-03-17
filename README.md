To-Do List API (projeto Decola Tech)
Descrição
O To-Do List API é uma API REST desenvolvida em Java com Spring Boot para gerenciar tarefas de uma lista de afazeres. A aplicação permite a realização de operações CRUD (Criar, Ler, Atualizar e Excluir) para manipular tarefas de forma eficiente.

Tecnologias Utilizadas
Java 23
Spring Boot
Spring Data JPA
Swagger (OpenAPI)
H2 Database (Banco de dados em memória para testes)

Funcionalidades
Criar Tarefa: Permite criar uma nova tarefa com título, descrição e status de conclusão.
Listar Tarefas: Exibe todas as tarefas cadastradas no sistema.
Buscar Tarefa por ID: Retorna uma tarefa específica pelo seu identificador.
Atualizar Tarefa: Modifica os detalhes de uma tarefa existente.
Excluir Tarefa: Remove uma tarefa do sistema com base no seu ID.

Como Executar o Projeto
1. Clonar o Repositório
git clone https://github.com/seu-usuario/todo-list-api.git
cd todo-list-api

3. Configurar o Banco de Dados
O projeto utiliza H2 Database, que roda em memória por padrão. Para usar um banco de dados persistente, modifique o arquivo application.properties:

properties

spring.datasource.url=jdbc:h2:mem:todo_db
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
Para usar um banco PostgreSQL ou outro, substitua as configurações acima pelas credenciais do banco desejado.

3. Construir e Executar a Aplicação
mvn clean install
mvn spring-boot:run
A API estará disponível em: http://localhost:8080

Documentação da API
Acesse a documentação via Swagger em:
http://localhost:8080/swagger-ui.html

Estrutura do Projeto

todo-list-api/
├── src/
│   ├── main/java/com/seuusuario/todolist/
│   │   ├── controller/    # Controllers da API
│   │   ├── service/       # Regras de negócio
│   │   ├── repository/    # Repositórios JPA
│   │   ├── model/         # Entidades (Tarefa)
├── pom.xml                # Dependências do projeto
├── README.md              # Documentação
