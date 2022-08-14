package extract_method.before_refactoring;

import java.util.Scanner;

public class CalcularNota {
    public static void main(String[] args) {
        double nota1;
        double nota2;
        double nota3;
        double media;

        Scanner s = new Scanner( System.in );

        System.out.println( "Digite a nota 1:");
        nota1 = s.nextDouble();

        System.out.println( "Digite a nota 2:");
        nota2 = s.nextDouble();

        System.out.println( "Digite a nota 3:");
        nota3 = s.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println( "A média é: " + media);
    }
}