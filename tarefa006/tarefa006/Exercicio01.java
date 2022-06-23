package br.com.tarefa006;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        int anos, meses, dias, totalDias;

        Scanner s = new Scanner( System.in );
        System.out.println( "Digite sua idade em ano, mes e dias: ");
        anos = s.nextInt();
        meses = s.nextInt();
        dias = s.nextInt();
        totalDias = dias + meses*30 + anos*365;

        System.out.println( "A sua idade em dias: " + totalDias );
    }

}