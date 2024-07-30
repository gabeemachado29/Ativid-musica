package src.java.model.entities;

import java.util.ArrayList;

public class Musico {
    
    private String nome;
    private String email;

    private ArrayList<Musica> musicas;

    public Musico (String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.musicas = new ArrayList<Musica>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(ArrayList<Musica> musicas) {
        this.musicas = musicas;
    }

    @Override
    public String toString() {
        return "[nome=" + nome + ", email=" + email + "]";
    }
}