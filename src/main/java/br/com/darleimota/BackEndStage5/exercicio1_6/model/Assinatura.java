package br.com.darleimota.BackEndStage5.exercicio1_6.model;

public class Assinatura {
    private String plano;

    public Assinatura(String plano) {
        this.plano = plano;
    }

    @Override
    public String toString() {
        return "Assinatura{" + "plano='" + plano + '\'' + '}';
    }
}