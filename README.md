# Projeto de Prova de Conceito - Chat Local com Escolha de Usuário (back-end)

## Descrição

Este projeto é uma prova de conceito em andamento, executado localmente, utilizando Vue.js para o front-end e Java com o framework Spring Boot para o back-end. O back-end é estruturado segundo o padrão MVC, escolhido para facilitar a manutenção e escalabilidade da aplicação. O banco de dados integrado H2 é utilizado, proporcionando uma alternativa leve e de fácil conexão. Por se tratar de um projeto em pequena escala e executado localmente, certas funcionalidades são feitas de maneira mais simples, e não existem métodos de segurança robustos implementados. No front-end, um menu de conversas permite ao usuário selecionar o destinatário e o perfil que será assumido durante a interação. 

## Funcionalidades

- Seleção do destinatário e perfil de usuário para a conversa.
- Sincronização entre as conversas, enviando informações para as entidades de chat e conversa no back-end.
- Comunicação eficiente com o back-end utilizando Axios.
- 
- Funcionalidades em desenvolvimento:
  - Criação de novos chats.
  - Exclusão de chats existentes.
  - Edição de mensagens em andamento.

## Tecnologias Utilizadas

- **Front-end:** Vue.js
- **Back-end:** Java com Spring Boot
- **Banco de Dados:** H2
- **Comunicação:** Axios

## Como Executar o Projeto

### Pré-requisitos

- [Java JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org/)

### Template de Configurações para o Projeto

https://start.spring.io/#!type=maven-project&language=java&platformVersion=3.3.4&packaging=jar&jvmVersion=17&groupId=com.example&artifactId=demo&name=demo&description=Demo%20project%20for%20Spring%20Boot&packageName=com.example.demo&dependencies=web,devtools,h2,thymeleaf,data-jdbc

### Configuração front-end:
Clone o Repositório front-end e deixe-o rodando localmente

### Configuração Back-end:

1. Navegue até a pasta do back-end do projeto.
2. Certifique-se de que o Maven esteja instalado.
3. Execute o seguinte comando para compilar e iniciar o servidor:
    mvn spring-boot:run
