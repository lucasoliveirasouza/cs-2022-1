package br.com.tarefa006;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner s = new Scanner( System.in );
        double salarioMinimo, salarioUsuario, quantidade;

        System.out.println( "Digite o valor da salário mínimo: ");
        salarioMinimo = s.nextDouble();

        System.out.println( "Digite o valor da salário usuário: ");
        salarioUsuario = s.nextDouble();

        quantidade = salarioUsuario/salarioMinimo;
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println( "Quantidade de salários mínimos: " + df.format(quantidade));
    }
}
