package extract_interface.before_refactoring;

public class Cachorro implements IBarulho {
    private String name;

    public Cachorro(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String emitirSom() {
        return "Oi, eu sou o " + name + " e eu sei latir";
    }
}
