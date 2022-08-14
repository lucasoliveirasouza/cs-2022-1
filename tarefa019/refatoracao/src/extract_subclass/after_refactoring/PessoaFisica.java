package extract_subclass.after_refactoring;

public class PessoaFisica extends Pessoa{

    public PessoaFisica(String nome) {
        super(nome);
    }

    @Override
    public void efetivar() {
        System.out.println("Assinar carteira de trabalho como CLT");
    }
}
