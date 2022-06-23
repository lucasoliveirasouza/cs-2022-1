package br.com.tarefa006;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        int numero, antecessor, sucessor;

        Scanner s = new Scanner( System.in );
        System.out.println( "Digite um número: ");
        numero = s.nextInt();
        antecessor = numero - 1;
        sucessor = numero + 1;

        System.out.println( "Antecessor: " + antecessor );
        System.out.println( "Sucessor: " + sucessor );
    }
}
