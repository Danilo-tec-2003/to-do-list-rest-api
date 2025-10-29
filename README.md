# 📝 To-Do List API - REST

![Status](https://img.shields.io/badge/status-concluído-green)
![Java](https://img.shields.io/badge/Java-17%2B-blue?logo=java&logoColor=white)
![Spring](https://img.shields.io/badge/Spring%20Boot-3.x-green?logo=spring&logoColor=white)
![H2](https://img.shields.io/badge/H2%20Database-lightgrey?logo=h2&logoColor=black)

A **To-Do List API** é uma aplicação backend que permite gerenciar uma lista de tarefas de forma simples e eficiente. Com ela, é possível realizar operações CRUD (Criar, Ler, Atualizar e Deletar) sobre tarefas, utilizando boas práticas de desenvolvimento com o ecossistema Spring.

---

## 📋 Índice

- [✨ Features Principais](#-features-principais)
- [🚀 Tecnologias Utilizadas](#-tecnologias-utilizadas)
- [🧠 Decisões de Arquitetura](#-decisões-de-arquitetura)
- [🛠️ Como Executar o Projeto](#️-como-executar-o-projeto)
- [🌳 Fluxo de Commits (Git Flow)](#-fluxo-de-commits-git-flow)
- [👨‍💻 Autor](#-autor)

---

## ✨ Features Principais

- **CRUD Completo:** Funcionalidades para Criar, Ler (todas e por ID), Atualizar e Excluir tarefas.
- **Banco de Dados em Memória:** Configurado com H2 para fácil execução e testes, sem necessidade de setup externo.
- **Documentação de API:** Geração automática e interativa da documentação com Swagger (SpringDoc).
- **Padrão DTO:** Utilização de Data Transfer Objects para separar as camadas de API e modelo de dados.

---

## 🚀 Tecnologias Utilizadas

- **Backend:**
  - Java 17
  - Spring Boot 3.x
  - Spring Data JPA (Hibernate)
  - SpringDoc (Swagger/OpenAPI)
- **Banco de Dados:**
  - H2 Database (em memória)
- **Ferramentas de Build e Ambiente:**
  - Maven
  - Git & GitHub

---

## 🧠 Decisões de Arquitetura

Mesmo sendo um projeto simples, optei por aplicar práticas de mercado que demonstram organização e escalabilidade.

1.  **Arquitetura em Camadas (Layered Architecture):**
    O projeto foi dividido em camadas de responsabilidade única:
    - `controller`: Lida exclusivamente com as requisições HTTP (endpoints da API).
    - `service`: Orquestra a lógica de negócio da aplicação.
    - `repository`: É a única camada responsável pela comunicação com o banco de dados.
    - `model`: Representa as entidades JPA (Task).

2.  **Padrão DTO (Data Transfer Object):**
    Utilizei DTOs (`dto/TaskDTO`) para separar o modelo de dados da API do modelo de dados do banco (`model/Task`). Isso aumenta a segurança, pois não expõe a entidade do banco diretamente, e desacopla as camadas.

3.  **Banco de Dados Embutido (H2):**
    A escolha do **H2 Database** foi estratégica para facilitar o desenvolvimento e os testes. Ele roda em memória e não exige nenhuma configuração de ambiente por parte do usuário, permitindo que o projeto seja executado imediatamente.

---

## 🛠️ Como Executar o Projeto

**Pré-requisitos:**
- Java (JDK) 17 ou superior
- Maven 3.8 ou superior

**Passo a passo:**

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/Danilo-tec-2003/to-do-list-rest-api.git](https://github.com/Danilo-tec-2003/to-do-list-rest-api.git)
    cd to-do-list-rest-api
    ```

2.  **Configuração do Banco de Dados:**
    Nenhuma ação é necessária. O projeto está configurado para usar o H2 (em memória) por padrão.

3.  **Execute a aplicação Spring Boot:**
    Use o Maven para compilar e iniciar o projeto:
    ```bash
    mvn spring-boot:run
    ```

4.  **Acesse a aplicação:**
    - **API (local):** `http://localhost:8080`
    - **Documentação Swagger:** `http://localhost:8080/swagger-ui.html`
    - **Console H2:** `http://localhost:8080/h2-console`
      (Use o JDBC URL: `jdbc:h2:mem:todo_db`)

---

## 🌳 Fluxo de Commits (Git Flow)

Para o versionamento, utilizei um fluxo de trabalho simplificado baseado no Git Flow:
- `main`: Branch principal, contendo apenas versões estáveis.
- `develop`: Branch de desenvolvimento, onde as features são integradas.
- Os commits seguiram o padrão de **Commits Semânticos** (`feat`, `fix`, `style`, `docs`, etc.) para manter o histórico do projeto limpo e organizado.

---

## 👨‍💻 Autor

- **Danilo Mendes de Araujo**
- **LinkedIn:** (https://www.linkedin.com/in/danilomendesaraujo/)
- **GitHub:** (https://github.com/Danilo-tec-2003)
