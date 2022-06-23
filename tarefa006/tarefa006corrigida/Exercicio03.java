package br.com.tarefa006corrigida;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exercicio03 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Exercicio01.class.getName());
        Scanner s = new Scanner( System.in );
        double saldo;
        double reajuste;

        logger.log(Level.INFO, "Digite o saldo: ");
        saldo = s.nextDouble();

        reajuste = saldo * 1.15;

        logger.log(Level.INFO, "Saldo com reajuste: {0}", reajuste);

    }
}
