# Spring-Standalone - aplicativos autônomos
## * * * Verificar as Branches para mais exemplos...
#### Verifique as branches para mais exemplos
### O Spring Boot facilita a criação de aplicativos independentes baseados em Spring de nível de produção. O Spring Boot fornece vários iniciadores para construir implementações de guerra independentes ou mais tradicionais. Criaremos o aplicativo autônomo Spring Boot implementando  a interface CommnadLineRunner .
### 1. Criação do Projeto
#### a. [Usando a sua IDE](https://www.javadevjournal.com/spring-boot/spring-boot-application-intellij/)
#### b. [Spring initializr](https://start.spring.io/)

### 2. A dependência do Maven
#### - O spring-boot-starter é a única dependência necessária para construir nosso aplicativo autônomo. Verificar o pom.xml

### 3. Classe de Serviço
#### — O bean HelloWorldService imprimirá uma mensagem de saudação para a API de chamada.

### 4. Classe principal do Spring Boot
#### — Na classe principal colocamos a anotação:
````
@SpringBootApplication.
````
### 5. Realizar o Build
````
 mvn package
````
### 6. Na execução bem-sucedida, podemos encontrar um jar executável (nome-aplication-0.0.1-SNAPSHOT.jar)
#### — Para executar o aplicativo, use o  java -jar comando:
````
$ java -jar target/hello_world-0.0.1-SNAPSHOT.jar
````
### 7. CommandLineRunner
#### — O uso do CommandLineRunner não é obrigatório, mas oferece várias vantagens durante a inicialização e gerenciamento do aplicativo.
````
É executado após o contexto do aplicativo ser carregado para que possamos usá-lo para verificar se existem determinados beans ou se os valores necessários foram inicializados corretamente.
Fornecer controle do processo de inicialização do sistema.
````
