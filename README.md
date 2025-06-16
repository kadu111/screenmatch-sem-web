# 🎬 ScreenMatch

O **ScreenMatch** é um projeto desenvolvido com Java e Spring Boot que simula uma aplicação para cadastro e consulta de séries e episódios, utilizando **persistência de dados com Spring Data JPA** e integração com a **API Gemini** da Google para tradução automática de textos.

Este projeto foi desenvolvido como parte do curso **"Java: persistência de dados e consultas com Spring Data JPA"** da Alura, com foco em boas práticas de desenvolvimento back-end, modelagem de dados e segurança com variáveis de ambiente.

## 📚 Conteúdos abordados

Durante o desenvolvimento deste projeto, foram aplicados diversos conceitos fundamentais para aplicações Java modernas com acesso a banco de dados relacional, como:

* 🔄 **ORM com JPA e Hibernate**

  * Mapeamento de entidades e relacionamentos (@OneToMany, @ManyToOne, etc.)
  * Estratégias de geração de IDs
  * Operações em cascata
  * Relacionamentos bidirecionais e unidirecionais

* 🧩 **Consultas com Spring Data JPA**

  * Consultas derivadas (Derived Queries)
  * Uso de cláusulas como `Top`, `Like`, `Ilike`, ordenações e filtros por múltiplos critérios
  * Consultas com JPQL (Java Persistence Query Language)
  * Exemplos de junções e filtragens complexas por data ou texto parcial

* 🛡️ **Segurança e boas práticas**

  * Utilização de variáveis de ambiente com `.env` para proteger dados sensíveis
  * Organização da camada de serviço com injeção de dependências
  * Separação em camadas (Controller, Service, Repository, Model)

* 🧠 **Integração com IA generativa**

  * Uso da API Gemini para tradução de trechos de texto com prompt customizado

* 🛢️ **Banco de dados**

  * Utilização do PostgreSQL como banco relacional
  * Configuração via `application.properties`
  * Conexão e manipulação de dados persistentes

## 🧠 Objetivo educacional

O projeto tem como objetivo consolidar o conhecimento sobre:

* Modelagem e persistência de dados com JPA
* Construção de consultas eficientes e performáticas
* Boas práticas com variáveis sensíveis
* Estruturação de um projeto Spring Boot
* Aplicações práticas da integração entre IA e sistemas back-end

## 🔐 Sobre a chave da API

A chave da API Gemini e a chave da API OMDb são utilizadas via variáveis de ambiente e **não estão incluídas no repositório** por motivos de segurança. O uso do `.env` permite manter os dados sensíveis fora do controle de versão.

## 📃 Licença

Este projeto é de uso educacional e está sob a [MIT License](LICENSE).
