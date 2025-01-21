# API RESTful de Gerenciamento de Produtos com Spring Boot

Este projeto é uma API RESTful desenvolvida com **Spring Boot**, utilizando **Maven** para gerenciamento de dependências e **PostgreSQL** como banco de dados. A API permite operações de **CRUD** (Create, Read, Update, Delete) para gerenciar produtos, seguindo a arquitetura **MVC** (Model-View-Controller).

## 📋 Descrição do Projeto

A API foi desenvolvida como parte do estudo do framework Spring Boot, com base no curso **Spring Boot 3 | Curso completo 2023** do canal [Michelli Brito](https://www.youtube.com/watch?v=wlYvA2b1BWI&ab_channel=MichelliBrito). O projeto inclui:

- Criação de um **CRUD** completo para produtos.
- Uso de **DTOs** (Data Transfer Objects) para validação e transferência de dados.
- Integração com banco de dados **PostgreSQL**.
- Implementação de **HATEOAS** para adicionar links dinâmicos aos recursos.
- Testes realizados com **Postman**.

---

## 🛠️ Tecnologias Utilizadas

- **Spring Boot 3**: Framework para desenvolvimento de aplicações Java.
- **Maven**: Gerenciador de dependências e build.
- **PostgreSQL**: Banco de dados relacional.
- **HATEOAS**: Adiciona links dinâmicos aos recursos da API.
- **Postman**: Ferramenta para testar os endpoints da API.

---

## 🚀 Como Executar o Projeto

Siga os passos abaixo para configurar e executar o projeto localmente.

### Pré-requisitos

- Java JDK 17 ou superior.
- Maven instalado.
- PostgreSQL instalado e configurado.
- IDE de sua preferência (recomendado IntelliJ IDEA ou Eclipse).

### Passos para Execução

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/rodvpx/Api-RestFull-SpringBoot3

2. **Configure o banco de dados**:
   - Crie um banco de dados no PostgreSQL.
   - Atualize as configurações de conexão no arquivo `application.properties`:
     ```properties
     spring.datasource.url=jdbc:postgresql://localhost:5432/nome_do_banco
     spring.datasource.username=seu_usuario
     spring.datasource.password=sua_senha
     spring.jpa.hibernate.ddl-auto=update
     ```

3. **Compile e execute o projeto**:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

4. **Acesse a API**:
   - A API estará disponível em `http://localhost:8080`.
   - Use ferramentas como [Postman](https://www.postman.com/) ou [Insomnia](https://insomnia.rest/) para testar os endpoints.

---

## 📂 Estrutura do Projeto

```
src/
├── main/
│   ├── java/
│   │   └── org/
│   │       └── example/
│   │           └── springbt/
│   │               ├── controllers/       # Controladores da API
│   │               ├── dtos/              # DTOs para transferência de dados
│   │               ├── models/            # Entidades do banco de dados
│   │               ├── repositories/      # Repositórios (JPA)
│   │               └── Application.java   # Classe principal
│   └── resources/
│       └── application.properties         # Configurações do projeto
└── test/                                  # Testes unitários e integração
```

---

## 🔍 Endpoints da API

A API oferece os seguintes endpoints:

### **POST** `/products`
- **Descrição**: Cria um novo produto.
- **Corpo da Requisição**:
  ```json
  {
    "name": "Nome do Produto",
    "value": 100.00
  }
  ```
- **Resposta**: Retorna o produto criado com status `201 Created`.

### **GET** `/products`
- **Descrição**: Retorna a lista de todos os produtos.
- **Resposta**: Retorna uma lista de produtos com status `200 OK`.

### **GET** `/products/{id}`
- **Descrição**: Retorna um produto específico pelo ID.
- **Resposta**: Retorna o produto com status `200 OK` ou `404 Not Found` se o produto não existir.

### **PUT** `/products/{id}`
- **Descrição**: Atualiza um produto existente.
- **Corpo da Requisição**:
  ```json
  {
    "name": "Nome Atualizado",
    "value": 150.00
  }
  ```
- **Resposta**: Retorna o produto atualizado com status `200 OK` ou `404 Not Found` se o produto não existir.

### **DELETE** `/products/{id}`
- **Descrição**: Remove um produto existente.
- **Resposta**: Retorna uma mensagem de sucesso com status `200 OK` ou `404 Not Found` se o produto não existir.

---

## 📚 Referências

Este projeto foi desenvolvido com base no curso **Spring Boot 3 | Curso completo 2023** do canal [Michelli Brito](https://www.youtube.com/watch?v=wlYvA2b1BWI&ab_channel=MichelliBrito). Recomendo assistir ao curso para aprofundar seus conhecimentos em Spring Boot.

---

## 🤝 Contribuição

Contribuições são bem-vindas! Siga os passos abaixo:

1. Faça um fork do projeto.
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`).
3. Commit suas alterações (`git commit -m 'Adicionando nova feature'`).
4. Push para a branch (`git push origin feature/nova-feature`).
5. Abra um Pull Request.

---
