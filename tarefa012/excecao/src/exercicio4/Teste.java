package exercicio4;

import exercicio3.Login;
import exercicio3.LoginInvalidoException;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner s = new Scanner( System.in );

        try{
            ContaBancaria conta = new ContaBancaria();
            conta.depositar(1500);
            conta.sacar(500);
            conta.sacar(2000);

        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}
