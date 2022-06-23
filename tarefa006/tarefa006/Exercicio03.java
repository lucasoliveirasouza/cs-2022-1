package br.com.tarefa006;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner s = new Scanner( System.in );
        double saldo,reajuste;

        System.out.println( "Digite o saldo: ");
        saldo = s.nextDouble();

        reajuste = saldo * 1.15;

        System.out.println( "Saldo com reajuste: " + reajuste);
    }
}
