package org.example;

import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;

public class CircuitBreakerExample {

    public void runExample() {
        // Configuração do Circuit Breaker
        CircuitBreakerConfig circuitBreakerConfig = CircuitBreakerConfig.custom()
                .failureRateThreshold(50) // Limiar de falha (50%)
                .waitDurationInOpenState(java.time.Duration.ofMillis(1000)) // Tempo de espera no estado aberto
                .build();

        // Criar o Circuit Breaker
        CircuitBreaker circuitBreaker = CircuitBreaker.of("example", circuitBreakerConfig);

        // Serviço remoto
        RemoteService remoteService = new RemoteService();

        // Realizar chamadas usando o Circuit Breaker
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

