package br.com.tarefa006;


public class Exercicio02 {

    public static void main(String[] args) {
        double media1 = (8 + 9 + 7)/3.0;
        System.out.println( "A media de 8, 9 e 7: " + media1 );

        double media2 = (4 + 5 + 6)/3.0;
        System.out.println( "A media de 4, 5 e 6: " + media2 );

        double soma = media1 + media2;
        System.out.println( "A soma das medias: " + soma );

        double media = soma/2.0;
        System.out.println( "A media das medias: " + media );
    }
}
