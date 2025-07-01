package br.com.darleimota.BackEndStage5.exercicio1_2;

class Pessoa {
    private String nome;
    private int idade;

    // Gson para poder desserializar e necessario ter uma classe vazia.
    public Pessoa() {}

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return nome + " - " + idade + " anos";
    }
}