package br.com.polimorfismo.exercicio02;

import java.util.ArrayList;

public class ProdutoTeste {

    public static void main(String[] args) {
        ArrayList<Produto> carrinho = new ArrayList<Produto>();
        Livro livro1 = new Livro("Use a cabeça");
        livro1.setAutor("Lucas");
        carrinho.add(livro1);
        Livro livro2 = new Livro("Como programatar em java");
        livro2.setAutor("Maria");
        carrinho.add(livro2);
        Mouse mouse1 = new Mouse("Mouse ótico, Saída USB");
        mouse1.setTipo("Tipo 1");
        carrinho.add(mouse1);
        Mouse mouse2 = new Mouse("Mouse ótico, Bluetooth");
        mouse2.setTipo("Tipo 2");
        carrinho.add(mouse2);

        for(int i = 0; i < carrinho.size(); i++){
            System.out.println(carrinho.get(i).getDescricao());
        }
    }
}
