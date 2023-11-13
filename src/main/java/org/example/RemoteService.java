package org.example;

public class RemoteService {

    public String call() {
        // Lógica para chamar o serviço remoto (simulada aqui)
        System.out.println("Chamando serviço remoto");
        // Simular uma falha para teste
        throw new RuntimeException("Erro na chamada do serviço remoto");
    }
}
