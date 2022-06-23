package br.com.tarefa006corrigida;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exercicio06 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Exercicio06.class.getName());
        Scanner s = new Scanner( System.in );
        int numero;
        int antecessor;
        int sucessor;

        logger.log(Level.INFO, "Digite um número: ");
        numero = s.nextInt();
        antecessor = numero - 1;
        sucessor = numero + 1;

        logger.log(Level.INFO, "Antecessor: {0}", antecessor);
        logger.log(Level.INFO, "Sucessor: {0}", sucessor);
    }
}
