package extract_subclass.after_refactoring;

public class PessoaJuridica extends Pessoa{

    public PessoaJuridica(String nome) {
        super(nome);
    }

    @Override
    public void efetivar() {
        System.out.println("Assinar contrato como PJ");
    }
}
