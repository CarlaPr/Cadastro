# 🚀 Cadastro de Usuários - API Rest (Mini-CRUD)

Este é um projeto prático desenvolvido para consolidar conceitos fundamentais do ecossistema **Java** e **Spring Boot**. Trata-se de uma API REST voltada para o gerenciamento básico de usuários (CRUD - Create, Read, Update, Delete), utilizando persistência em banco de dados em memória.

## 🛠️ Tecnologias e Ferramentas Utilizadas

- **Linguagem:** Java 25
- **Framework:** Spring Boot 4.0.6
- **Persistência de Dados:** Spring Data JPA / Hibernate
- **Banco de Dados:** H2 Database (Em memória)
- **Produtividade:** Lombok (Builders, Getters/Setters e Construtores automáticos)
- **Gerenciador de Dependências:** Maven

## 📈 Arquitetura e Organização do Código

O projeto segue os padrões de camadas comumente exigidos pelo mercado:
- **`controller`**: Responsável pela exposição dos endpoints HTTP e recepção das requisições.
- **`business` (Service)**: Camada de regras de negócio e validações lógicas da aplicação.
- **`infrastructure`**: Contém as configurações do banco de dados, mapeamento de entidades JPA (`Usuario`) e os repositórios (`UsuarioRepository`) que estendem o `JpaRepository`.

## 🌐 Endpoints da API

A API expõe os seguintes recursos abaixo do caminho base `/usuario`:

| Método | Endpoint | Parâmetros | Descrição |
| :--- | :--- | :--- | :--- |
| **POST** | `/usuario` | Request Body (JSON) | Cadastra um novo usuário no sistema. |
| **GET** | `/usuario` | `?email={email}` | Busca as informações de um usuário pelo e-mail. |
| **PUT** | `/usuario` | `?id={id}`, Request Body | Atualiza de forma inteligente os dados de um usuário pelo ID. |
| **DELETE** | `/usuario` | `?email={email}` | Remove um usuário do sistema com base no e-mail. |

### 📥 Exemplo de Payload (JSON) para Criação/Edição:
```json
{
  "nome": "Carla Cristina",
  "email": "carla@email.com"
}
