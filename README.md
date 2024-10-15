<h1 align="center">🌟 SISTEMA DE COMPRAS  🌟</h1>

<h2>📋 SUMÁRIO</h2>

- [🔍 Visão Geral](#-VisãoGeral)
- [🏛️ Arquitetura ](#-Arquitetura )
- [🚀 Para startar o projeto](#-Iniciar)
- [📖 Documentação-API](#-Documentação-API)
- [🤝 Integrantes](#-Integrantes)

## 🔍 VisãoGeral
<p>
Projeto apresentado como requisito para processo seletivo sicred.
</p>

## 🏛️ Arquitetura

Em java 17 juntamente com o framework  spring boot entre outros citados nesse durante o projeto onde foi implementado toda a lógica de negócio, utilizamos alguns padrões de projeto como:


- **MVC :** onde o projeto é dividido em três camadas: a camada de interação do usuário (view), a camada de manipulação dos dados (model) e a camada de controle (controller).

- **Repository:** para abstrair a camada de acesso ao banco de dados.

- **DTO (Data Transfer Object)** padrão voltado para transferência de dados entre camadas de aplicação.

- **Padrão Mapper:** para transformar DTO´s em entidades e vice-versa.

- **Lombok:** Que é uma biblioteca que permite deixar o código mais limpo reduzindo o boilerplate por meio de anotações.
- 
- **Banco de Dados H2 EM MEMÓRIA:** Para vacilitar os testes em qualquer ambiente optei por utilizar um banco de dados em memória
- 
- **Dockerfile:** Para realizar deploy da aplicação no render.
- 
- **Swagger:** Para documentação do sistema

- **Specification do JPA:** Para realizar o filtro de forma mais dinâmica
- 
- **Tratamento personalizado de Exceptions:** 


## 🚀 Iniciar

- É necessário ter um java 17 instalado e configurado na maquina e uma IDE para rodar o projeto localmente.
- Ter maven instalado para baixar as dependencias

## 📖 Documentação-API

foi realizado a no render segue link do swagger:
https://sicred-sistema-compra.onrender.com/swagger-ui/index.html


## 🤝 Integrante
- SUELITON DE OLIVEIRA 

