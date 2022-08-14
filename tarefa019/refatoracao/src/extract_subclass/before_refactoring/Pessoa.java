package extract_subclass.before_refactoring;

public class Pessoa {
    private String nome;
    private boolean ehPj;

    public Pessoa(String nome, boolean ehPj) {
        this.nome = nome;
        this.ehPj = ehPj;
    }

    public void efetivar(){
        System.out.println(ehPj ? "Assinar contrato como PJ" : "Assinar carteira de trabalho como CLT");
    }
}
