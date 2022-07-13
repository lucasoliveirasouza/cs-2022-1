package exercicio3;

public class Login {

    public boolean fazerLogin(String usuario, String senha) throws LoginInvalidoException {
        boolean valido = false;
        if(usuario.equals("lucas") && senha.equals("123456")){
            valido = true;
        }
        if(!valido){
            throw new LoginInvalidoException("Usuário e senha inválidos");
        }else{

        }
        return true;

    }
}
