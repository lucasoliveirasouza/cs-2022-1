package encapsulate_field.after_refactoring;

public class Cachorro {
    private String nome;
    private double tamanho;
    private double peso;
    private int idade;

    Cachorro(String nome, double tamanho, double peso, int idade){
        this.nome = nome;
        this.tamanho = tamanho;
        this.peso = peso;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
