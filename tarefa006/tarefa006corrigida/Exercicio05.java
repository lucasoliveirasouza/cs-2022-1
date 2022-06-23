package br.com.tarefa006corrigida;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exercicio05 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Exercicio01.class.getName());
        Scanner s = new Scanner( System.in );

        double salarioMinimo;
        double salarioUsuario;
        double quantidade;

        logger.log(Level.INFO, "Digite o valor da salário mínimo: ");
        salarioMinimo = s.nextDouble();

        logger.log(Level.INFO, "Digite o valor da salário usuário: ");
        salarioUsuario = s.nextDouble();

        quantidade = salarioUsuario/salarioMinimo;
        DecimalFormat df = new DecimalFormat("#.00");

        logger.log(Level.INFO, "Quantidade de salários mínimos: {0}", df.format(quantidade));
    }
}
