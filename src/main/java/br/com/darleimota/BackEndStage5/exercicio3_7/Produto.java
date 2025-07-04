package br.com.darleimota.BackEndStage5.exercicio3_7;

public class Produto {
    private String nome;
    private double preco;
    private String categoria;

    public Produto(String nome, double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return  "\nProduto {\n" +
                "  Nome: " + nome + "\n" +
                "  Preço: R$ " + preco + "\n" +
                "  Categoria: " + categoria + "\n" +
                "}";
    }
}