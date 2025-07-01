package br.com.darleimota.BackEndStage5.exercicio1_6.model;

public class Servico {
    private String tipo;

    public Servico(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Servico{" + "tipo='" + tipo + '\'' + '}';
    }
}