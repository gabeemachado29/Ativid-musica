package src.java.model.entities;

import java.util.ArrayList;

public class CD {
    
    private String titulo;
    private int ano;
    private boolean ehDuplo;

    private Banda banda;
    private ArrayList<Musica> musicas;

    public CD(String titulo, int ano, boolean ehDuplo, Banda banda) {
        this.titulo = titulo;
        this.ano = ano;
        this.ehDuplo = ehDuplo;
        this.banda = banda;
        this.musicas = new ArrayList<Musica>();
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setEhDuplo(boolean ehDuplo) {
        this.ehDuplo = ehDuplo;
    }

    public Banda getBanda() {
        return this.banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }

    @Override
    public String toString() {
        return "[titulo= " + this.titulo + ", ano= " + this.ano + ", ehDuplo= " + this.ehDuplo + ", banda= " + this.banda + ", musicas= " + this.musicas + "]";
    }

}
