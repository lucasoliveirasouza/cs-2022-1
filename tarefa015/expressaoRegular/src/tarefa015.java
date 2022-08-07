import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class tarefa015 {

    public static void main(String[] args) {
        String regexLogin = "^(?=.*[A-z])(?=.*[0-9])(?=.*[@#$%^&+=])(?=\\S+$).{5,30}$";
        Pattern pLogin = Pattern.compile(regexLogin);
        String regexSenha = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%^&+=])(?=\\S+$).{8,12}$";
        Pattern pSenha = Pattern.compile(regexSenha);
        String login;
        String senha;


        Scanner s = new Scanner( System.in );

        System.out.println( "Digite seu login:");
        login = s.next();
        Matcher mLogin = pLogin.matcher(login);

        if(!mLogin.matches()){
            System.out.println( "O seu login precisa seguir a seguinte regra:\n" +
                    "Possuir pelo menos 5 e no máximo 30 caracteres\n" +
                    "Possuir letras, números e caracteres especiais");
        }


        System.out.println( "Digite sua senhaa:");
        senha = s.next();
        Matcher mSenha = pLogin.matcher(senha);

        if(!mSenha.matches()){
            System.out.println( "A sua senha precisa seguir a seguinte regra:\n" +
                    "Possuir pelo menos 8 e no máximo 12 caracteres\n" +
                    "Possuir pelo menos uma letra maiúscula,uma letra minúscula, um número e um caracter especial");
        }

    }
}
