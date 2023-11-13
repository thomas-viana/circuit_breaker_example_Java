package org.example;

import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;

/*
Classe principal onde a seção de configuração do Circuit Breaker,
 onde definimos o limiar de falha e o tempo de espera no estado aberto.
*/

public class CircuitBreakerExample {

    public void runExample() {
        //A criação do Circuit Breaker usando a configuração definida.
        CircuitBreakerConfig circuitBreakerConfig = CircuitBreakerConfig.custom()
                .failureRateThreshold(50) // Limiar de falha (50%)
                .waitDurationInOpenState(java.time.Duration.ofMillis(1000)) // Tempo de espera no estado aberto
                .build();

        // Continuando a criação do circuitbreaker com a definição de limiar e tempo de espera já estábelecido
        CircuitBreaker circuitBreaker = CircuitBreaker.of("example", circuitBreakerConfig);

        /* A simulação do serviço remoto, utilizado para simular as requisições,
        por exemplo, de uma API com a classe RemoteService.
        */
        RemoteService remoteService = new RemoteService();

        /* O loop que realiza chamadas usando o Circuit Breaker,
        capturando e tratando exceções quando necessário. */
        for (int i = 0; i < 5; i++) {
            try {
                String result = circuitBreaker.executeSupplier(remoteService::call);
                System.out.println("Resultado da chamada: " + result);
            } catch (Exception e) {
                System.out.println("Exceção capturada: " + e.getMessage());
            }
            System.out.println("Estado do Circuit Breaker: " + circuitBreaker.getState());
            System.out.println();
        }
    }
}

