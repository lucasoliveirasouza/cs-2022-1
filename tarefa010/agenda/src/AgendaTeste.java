public class AgendaTeste {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        Contato c1 = new Contato("Luca Benetti", "lucabbenetti@discente.ufg.br");
        Contato c2 = new Contato("Lucas Souza", "souzaoliveira@discente.ufg.br");
        Contato c3 = new Contato("Vitor Henrique", "britobrito@discente.ufg.br");
        Contato c4 = new Contato("Giancarlo Oliveira", "giancarlooliveira@discente.ufg.br");

        agenda.adicionarContato(c1);
        agenda.adicionarContato(c2);
        agenda.adicionarContato(c3);
        agenda.adicionarContato(c4);

        System.out.println(agenda.listarContatos());
    }
}
