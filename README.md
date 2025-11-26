# API Livro

Uma API REST desenvolvida em Spring Boot para gerenciamento de autores e livros.

## 📋 Descrição

Esta é uma aplicação Spring Boot que fornece endpoints para operações CRUD (Create, Read, Update, Delete) sobre autores e livros. A aplicação utiliza JPA para persistência de dados e PostgreSQL como banco de dados.

## 🚀 Tecnologias Utilizadas

- **Java 21**
- **Spring Boot 3.2.6**
- **Spring Data JPA**
- **PostgreSQL**
- **Maven**

  
## 🗂️ Modelos de Dados

### Autor
- `id` (Long) - Identificador único
- `nome` (String) - Nome do autor
- `nascimento` (String) - Data de nascimento
- `ano_falecimento` (Date) - Data de falecimento (opcional)

### Livro
- `id` (Long) - Identificador único
- `titulo` (String) - Título do livro
- `autor` (String) - Nome do autor
- `idioma` (String) - Idioma do livro
- `numero_Downloads` (int) - Número de downloads

## 📊 DTOs (Data Transfer Objects)

### AutorDTO
Record para transferência de dados do autor:
```java
public record AutorDTO(String nome, String nascimento, Date Aano_falecimento)

## LivroDTO
Record para transferência de dados do livro:
``` public record LivroDTO(String titulo, String autor, String idioma, int numero_Downloads) ```

# 🗃️ Repositórios

- AutorRepository - Interface JPA para operações com a entidade Autor

- LivroRepository - Interface JPA para operações com a entidade Livro

# 🔧 Configuração e Execução

*Pré-requisitos*
 -Java 21

-Maven 3.6+

-PostgreSQL

##Configuração do Banco de Dados

1. Crie um banco de dados PostgreSQL

2. Configure as propriedades de conexão no application.properties:

```spring.datasource.url=jdbc:postgresql://localhost:5432/nome_do_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update ```

## Exemplo de Endpoints:
**Autores:**

GET /autores - Lista todos os autores

GET /autores/{id} - Busca autor por ID

POST /autores - Cria um novo autor

PUT /autores/{id} - Atualiza um autor

DELETE /autores/{id} - Remove um autor

**Livros:**

GET /livros - Lista todos os livros

GET /livros/{id} - Busca livro por ID

POST /livros - Cria um novo livro

PUT /livros/{id} - Atualiza um livro

DELETE /livros/{id} - Remove um livro
