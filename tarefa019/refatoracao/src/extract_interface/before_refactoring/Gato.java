package extract_interface.before_refactoring;

public class Gato {

    private String name;

    public Gato(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String emitirSom(){
        return "Oi, eu sou o " + name + " e eu sei miar";
    }
}
