package exercicio3;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner s = new Scanner( System.in );
        String usuario;
        String senha;
        try{
            System.out.println("Digite o usuário:");
            usuario = s.next();

            System.out.println("Digite a senha:");
            senha = s.next();

            Login login = new Login();

            System.out.println(login.fazerLogin(usuario,senha));

        }catch (ArrayIndexOutOfBoundsException aibe){
            System.out.println("Você ultrapassou o tamanho do vetor.");
        } catch (LoginInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
