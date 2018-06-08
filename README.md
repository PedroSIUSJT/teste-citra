Projeto Conta

Projeto utiliza:

* Este projeto é uma API REST escrita em Spring Boot com Java utilizando Maven com um banco de dados em memória (H2DataBase)

* Baixe o projeto acesse a pasta via terminal e rode o comando "mvn spring-boot:run" ( É necessário ter o maven instalado )
 
### endpoints

GET   http://localhost:9090/conta   Busca as contas

POST   http://localhost:9090/conta   Insere uma nova conta
```json
{
    "nome": "Seu nome"
}
```

Obs: O banco de dados por ser em memória terá a vida da aplicação, ou seja, as novas contas inseridas viveram
enquanto a aplicação estiver viva.