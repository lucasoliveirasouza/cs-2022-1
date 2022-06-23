package br.com.tarefa006corrigida;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exercicio01 {
    public static void main(String[] args) {
        int anos;
        int meses;
        int dias;
        int totalDias;

        Logger logger = Logger.getLogger(Exercicio01.class.getName());
        Scanner s = new Scanner( System.in );

        logger.log(Level.INFO, "Digite sua idade em ano, mes e dias: ");
        anos = s.nextInt();
        meses = s.nextInt();
        dias = s.nextInt();
        totalDias = dias + meses*30 + anos*365;

        logger.log(Level.INFO, "A sua idade em dias: {0}", totalDias);
    }
}
