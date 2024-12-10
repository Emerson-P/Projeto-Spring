# E-commerce Spring Boot Project

Este projeto é uma aplicação de e-commerce desenvolvida em Java com o framework Spring Boot. Ele implementa funcionalidades básicas de gerenciamento de produtos, pedidos, usuários e pagamentos. O projeto foi estruturado em camadas lógicas bem definidas e utiliza um banco de dados em memória (H2) para testes.

## 🛠️ Funcionalidades

- **Modelo de Domínio**: Implementação de um modelo de domínio para produtos, categorias, usuários, pedidos e pagamentos, conforme diagrama fornecido.
- **CRUD Completo**: Operações de criação, leitura, atualização e exclusão para as principais entidades.
- **Camadas Lógicas**:
  - **Resource**
  - **Service**
  - **Repository**
  ![image](https://github.com/user-attachments/assets/ce44c2df-a854-4895-97e9-5ee0b1a1cefc)

- **Banco de Dados**:
  - Configuração do banco de dados H2 para testes.
  - População inicial do banco com dados de exemplo.


## 🚀 Tecnologias Utilizadas

- **Java**: Linguagem principal do projeto.
- **Spring Boot**: Framework para simplificação do desenvolvimento.
- **Spring Data JPA**: Para integração com o banco de dados.
- **H2 Database**: Banco de dados em memória utilizado para testes.
- **Postman/Insomnia**: Para testar os endpoints da API.

## 🗂️ Modelo de Domínio

O projeto segue o modelo de domínio abaixo:

- **Entidades**:
  - **User**: Representa os clientes do sistema.
  - **Order**: Gerencia pedidos realizados pelos usuários.
  - **Product**: Lista de produtos disponíveis no catálogo.
  - **Category**: Classificação dos produtos.
  - **OrderItem**: Representa itens específicos de um pedido.
  - **Payment**: Gerencia informações sobre pagamentos.
  - **OrderStatus**: Enumeração que define o status de um pedido.
![image](https://github.com/user-attachments/assets/add73932-fe2d-487b-98b0-58227124f558)



