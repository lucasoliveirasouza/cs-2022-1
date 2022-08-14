package logging;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Teste {

    final static Logger logger = Logger.getLogger(Teste.class.getName());

    public static void main(String[] args) {

        Teste obj = new Teste();
        int dividendo;
        int divisor;
        Scanner s = new Scanner( System.in );

        try{
            System.out.println( "Digite o dividendo: ");
            dividendo = s.nextInt();
            System.out.println( "Digite o divisor: ");
            divisor = s.nextInt();
            System.out.println("O resultado da divisão: " + obj.dividir(dividendo,divisor));
        }catch(ArithmeticException ex){
            logger.log(Level.WARNING, "Não é possível realizar uma divisão por zero!");
        }
    }

    private double dividir(int a, int b){
        return a*1.0/b;
    }
}
