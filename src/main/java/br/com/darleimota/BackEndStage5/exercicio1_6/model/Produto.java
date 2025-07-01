package br.com.darleimota.BackEndStage5.exercicio1_6.model;

public class Produto {
    private String nome;

    public Produto(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome='" + nome + '\'' + '}';
    }
}