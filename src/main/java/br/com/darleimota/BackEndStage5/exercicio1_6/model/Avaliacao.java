package br.com.darleimota.BackEndStage5.exercicio1_6.model;

public class Avaliacao <T> {

    private T item;
    private int nota;
    private String comentario;

    public Avaliacao(T item, int nota, String comentario) {
        this.item = item;
        setNota(nota);
        this.comentario = comentario;
    }

    public T getItem() {
        return item;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        if(nota < 0 || nota > 10){
            throw new IllegalArgumentException("A nota tem que ser 0 ou 10");
        }
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    @Override
    public String toString() {
        return "Avaliacao{" +
                "item=" + item +
                ", nota=" + nota +
                ", comentario='" + comentario + '\'' +
                '}';
    }
}
