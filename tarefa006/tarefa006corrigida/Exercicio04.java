package br.com.tarefa006corrigida;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exercicio04 {
    static Peca peca1 = new Peca();
    static Peca peca2 = new Peca();
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Exercicio01.class.getName());
        Scanner s = new Scanner( System.in );

        peca1.codigo = 0;
        peca2.codigo = 0;
        double ipi;

        logger.log(Level.INFO, "Digite o valor do IPI: ");
        ipi = s.nextDouble();

        logger.log(Level.INFO, "Digite o código da peça 1: ");
        peca1.codigo = s.nextInt();

        logger.log(Level.INFO, "Digite o valor da peça 1: ");
        peca1.valor = s.nextDouble();

        logger.log(Level.INFO, "Digite a quantidade da peça 1: ");
        peca1.quantidade = s.nextInt();

        logger.log(Level.INFO, "Digite o código da peça 2: ");
        peca2.codigo = s.nextInt();

        logger.log(Level.INFO, "Digite o valor da peça 2: ");
        peca2.valor = s.nextDouble();

        logger.log(Level.INFO, "Digite a quantidade da peça 2: ");
        peca2.quantidade = s.nextInt();

        double valorTotal = (peca1.valor*peca1.quantidade + peca2.valor* peca2.quantidade)*((ipi/100) + 1);

        logger.log(Level.INFO, "O valor do IPI: {0}", valorTotal);

    }

    private static class Peca {
        int codigo;
        double valor;
        int quantidade;
    }
}
