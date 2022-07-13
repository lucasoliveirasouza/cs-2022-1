package exercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoTeste {

    public static int dividir(int dividendo, int divisor){
        return dividendo/divisor;
    }

    public static void main(String[] args) {
        int dividendo;
        int divisor;
        Scanner s = new Scanner( System.in );

        try{
            System.out.println( "Digite o dividendo: ");
            dividendo = s.nextInt();
            System.out.println( "Digite o divisor: ");
            divisor = s.nextInt();
            System.out.println("O resultado da divisão: " + dividir(dividendo,divisor));
        }catch (ArithmeticException arithmeticException){
            System.out.println("O denominador não pode ser zero");
        } catch (InputMismatchException inputMismatchException){
            System.out.println("Voce tem que digitar apenas números");
        }

    }
}
