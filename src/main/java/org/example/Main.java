package org.example;

// Classe principal Main aqui é onde iniciamos o funcionamento da simulação.
public class Main {

    // Método main é o ponto de entrada para a aplicação Java
    public static void main(String[] args) {

        /*
        Criar uma instância da classe CircuitBreakerExample,
        isso permite que você acesse os métodos e propriedades dessa classe.
        */
        CircuitBreakerExample circuitBreakerExample = new CircuitBreakerExample();

        // Chamar o método runExample() para executar o exemplo do Circuit Breaker
        circuitBreakerExample.runExample();
    }
}

/*
O propósito deste script é criar cria uma instância da classe CircuitBreakerExample
e chama um método chamado runExample() nesta instância.
A classe CircuitBreakerExample contém a lógica específica do exemplo do Circuit Breaker que discutimos anteriormente.
O método main é o ponto de entrada que inicia a execução do programa Java.
*/