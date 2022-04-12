# To Do App
Aplicação de lista de tarefas desenvolvida durante o curso do programa Start da Capgemini

## O projeto

- [O projeto](#o-projeto)
  - [Descrição](#descrição)
  - [Objetivos](#objetivo)
  - [Entidades](#entidades)
    - [Projeto](#projeto)
    - [Tarefa](#tarefa)
- [Requisitos](#requisitos)
  - [Requisitos funcionais](#requisitos-funcionais)
  - [Requisitos não funcionais](#requisitos-não-funcionais)
- [Tecnologias utilizadas](#tecnologias-utilizadas)
  - [Java](#java)
  - [MySQL](#mysql)

### Descrição

Aplicação para o gerenciamento de projetos e as tarefas referentes a cada projeto.

### Objetivo

Contibuir com o melhoramento da organização e gerenciamento das tarefas de projetos.

### Entidades

#### Projeto

- Nome
- Descrição
- Data de criação
- Data de atualização
- Tarefas


#### Tarefa

- Nome
- Descrição
- Status
- Prazo
- Data de criação
- Data de atualização

## Requisitos

### Requisitos funcionais

#### Criar um novo projeto

O usuário consiguirá cadastrar novos projetos no sistema.

#### Visualizar informações de projeto

O usuário poderá visualizar as informações que estejam cadastradas no sistema à respeito de um
projeto.

#### Alterar um projeto

O usuário será capaz de editar as informações de um projeto cadastrado anteriormente no sistema.

#### Excluir um projeto

O usuário poderá excluir permanentemente um projeto cadastrado no sistema.

#### Criar nova tarefa

O usuário poderá cadastrar uma nova tarefa nos projetos cadastrados no sistema.

#### Visualizar informações de tarefa

O usuário poderá visualizar as informações de uma tarefa que esteja cadastrada no sistema.

#### Alterar uma tarefa

O usuário poderá alterar as informações de uma tarefa que esteja cadastrada no sistema.

#### Excluir uma tarefa

O usuário poderá excluir permanentemente uma tarefa cadastrada no sistema.

### Requisitos não funcionais

#### Toda tarefa deve pertencer a um projeto

O sistema deve ser incapaz de salvar uma tarefa sem que haja uma associação entre ela e um
dos projetos já cadastrados no sistema.

Para atingir esse objetivo o campo de projeto será obrigatório no momento do cadastro das
tarefas, e todas as tarefas de um projeto serão excluídas no momento de sua exclusão.

#### O sistema não deve trabalhar com o conceito de usuário

O sistema não deve implementar cadstro, login, ou restrições com base em quem está o usando
no momento.

### Tecnologias utilizadas

#### Java

A linguagem Java foi escolhida para o desenvolvimento dessa apliacação por ser uma linguagem
versátil e bastante utilizada no mercaso, além de ser a linguagem foco do curso seguido para
o desenvolvimento desse código.

#### MySQL

O MySQL foi escolhido também por ser bastante utilizada no mercado e por ter sido abordada durante
o curso seguido para o sesenvolvimento dessa aplicação.
