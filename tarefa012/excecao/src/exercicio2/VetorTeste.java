package exercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VetorTeste {

    public static void main(String[] args) {
        int vetor[] = new int[10];
        int valor;
        int i = 0;
        Scanner s = new Scanner( System.in );

        try{
            System.out.println("Digite os valores do vetor:");
            valor = s.nextInt();
            while(valor != 0){
                vetor[i] = valor;
                valor = s.nextInt();

                i++;
            }

        }catch (ArrayIndexOutOfBoundsException aibe){
            System.out.println("Você ultrapassou o tamanho do vetor.");
        } catch (InputMismatchException inputMismatchException){
            System.out.println("Voce tem que digitar apenas números");
        }

    }
}
