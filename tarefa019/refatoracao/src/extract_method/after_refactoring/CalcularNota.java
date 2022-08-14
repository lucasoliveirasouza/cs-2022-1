package extract_method.after_refactoring;

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

        media = calcularMedia(nota1, nota2, nota3);

        System.out.println( "A média é: " + media);
    }

    public static double calcularMedia(double a, double b, double c){
        return (a + b + c) / 3;
    }
}
