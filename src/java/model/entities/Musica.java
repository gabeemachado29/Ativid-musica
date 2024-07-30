package src.java.model.entities;

import java.util.ArrayList;

public class Musica {
    
    private String titulo;
    private int duracao;

    private CD cds;
    private ArrayList<Musico> musicos;

    public Musica(String titulo, int duracao, CD cds) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.cds = cds;
        this.musicos = new ArrayList<Musico>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public CD getCds() {
        return cds;
    }

    public void setCds(CD cds) {
        this.cds = cds;
    }

    public ArrayList<Musico> getMusicos() {
        return musicos;
    }

    public void setMusicos(ArrayList<Musico> musicos) {
        this.musicos = musicos;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
