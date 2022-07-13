package exercicio3;

public class Login {

    public boolean fazerLogin(String usuario, String senha) throws LoginException {
        boolean valido = false;
        if(usuario.equals("lucas") && senha.equals("123456")){
            valido = true;
        }
        if(!valido){
            throw new LoginException("Usuário e senha inválidos");
        }else{

        }
        return true;

    }
}
