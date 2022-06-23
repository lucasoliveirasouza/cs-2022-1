package br.com.tarefa006corrigida;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Exercicio02 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Exercicio02.class.getName());

        double media1 = (8 + 9 + 7)/3.0;
        logger.log(Level.INFO, "A media de 8, 9 e 7: {0}", media1);

        double media2 = (4 + 5 + 6)/3.0;
        logger.log(Level.INFO, "A media de 4, 5 e 6: {0}", media2);

        double soma = media1 + media2;
        logger.log(Level.INFO, "A soma das medias: {0}", soma);

        double media = soma/2.0;
        logger.log(Level.INFO, "A media das medias: {0}", media);
    }
}
