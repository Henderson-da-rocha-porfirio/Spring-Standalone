# Desafio 2022 - teste para a vaga de desenvolvedor backend java
## *** Utilizando Spring Standalone - Criação de um App Autônomo
## *** Versão do Java Utilizada: 11
## *** Versão do Spring: 2.7.2
###
### 1. Cenário de Negócio:
````
Todo dia útil por volta das 6 horas da manhã um colaborador da retaguarda do Sicredi recebe e organiza as informações de contas para enviar ao Banco Central.
Todas agencias e cooperativas enviam arquivos Excel à Retaguarda. Hoje o Sicredi já possiu mais de 4 milhões de contas ativas.
Esse usuário da retaguarda exporta manualmente os dados em um arquivo CSV para ser enviada para a Receita Federal, antes as 10:00 da manhã na abertura das agências.
````
### 2. Requisito:
````
Usar o "serviço da receita" (fake) para processamento automático do arquivo.
````

### 3. Funcionalidade:
````
0. Criar uma aplicação SpringBoot standalone. Exemplo: java -jar target/sicrediteste-0.0.1-SNAPSHOT.jar
1. Processa um arquivo CSV de entrada com o formato abaixo.
2. Envia a atualização para a Receita através do serviço (SIMULADO pela classe ReceitaService).
3. Retorna um arquivo com o resultado do envio da atualização da Receita. Mesmo formato adicionando o resultado em uma nova coluna.
````

### 4. Formato CSV:
````
agencia;conta;saldo;status
0101;12225-6;100,00;A
0101;12226-8;3200,50;A
3202;40011-1;-35,12;I
3202;54001-2;0,00;P
3202;00321-2;34500,00;B
...
````
### 5. Endpoint para teste no Postman:
````
http://localhost:8080/sincronizar/exportar
````
