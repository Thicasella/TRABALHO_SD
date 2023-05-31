package server;

import java.util.Random;
import util.Status;

public class JogoImparPar {
    public Status jogar(double d) {
        // Gere um número aleatório para o servidor
        int numeroServidor = gerarNumeroAleatorio();

        // Verifique se a soma do número do cliente e do número do servidor é ímpar ou par
        double soma = d + numeroServidor;

        if (soma % 2 == 0) {
            return util.Status.Maquina_Ganhou;
        } else {
            return util.Status.Cliente_Ganhou;
        }
    }

    private int gerarNumeroAleatorio() {
        // Lógica para gerar um número aleatório (pode usar a classe Random)
            Random random = new Random();
            int numeroServidor = random.nextInt(10);
            return numeroServidor;
    }
}
