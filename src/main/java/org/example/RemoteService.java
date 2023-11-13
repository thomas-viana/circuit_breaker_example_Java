package org.example;

public class RemoteService {

    public String call() {
        //Este método representa a lógica simulada para a chamada ao serviço remoto.
        System.out.println("Chamando serviço remoto");
        /*
        Lança uma exceção RuntimeException para simular um erro durante a chamada ao serviço remoto.
        Isso pode representar, por exemplo, uma falha na comunicação com o serviço real.
        */
        throw new RuntimeException("Erro na chamada do serviço remoto");
    }
}

/*
Este script representa uma implementação simples de uma classe
RemoteService que simula o comportamento de um serviço remoto.
É comum usar uma estrutura como essa para testar o comportamento de um sistema quando ocorrem falhas no serviço remoto,
permitindo que você avalie como sua aplicação lida com essas situações.
*/