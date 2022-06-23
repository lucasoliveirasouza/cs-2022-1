package br.com.tarefa006;

import java.util.Scanner;

public class Exercicio04 {
    static Peca peca1 = new Peca();
    static Peca peca2 = new Peca();
    public static void main(String[] args) {
        Scanner s = new Scanner( System.in );

        peca1.codigo = 0;
        peca2.codigo = 0;
        double ipi;

        System.out.println( "Digite o valor do IPI: ");
        ipi = s.nextDouble();

        System.out.println( "Digite o código da peça 1: ");
        peca1.codigo = s.nextInt();

        System.out.println( "Digite o valor da peça 1: ");
        peca1.valor = s.nextDouble();

        System.out.println( "Digite a quantidade da peça 1: ");
        peca1.quantidade = s.nextInt();

        System.out.println( "Digite o código da peça 2: ");
        peca2.codigo = s.nextInt();

        System.out.println( "Digite o valor da peça 2: ");
        peca2.valor = s.nextDouble();

        System.out.println( "Digite a quantidade da peça 2: ");
        peca2.quantidade = s.nextInt();

        double valor_total = (peca1.valor*peca1.quantidade + peca2.valor* peca2.quantidade)*((ipi/100) + 1);

        System.out.println("O valor do IPI: " + valor_total);

    }

    private static class Peca {
        int codigo;
        double valor;
        int quantidade;
    }
}

