package src.java.model.entities;

import java.util.ArrayList;

public class Banda {
    
    private String nome;
    private EstiloEnum estilo;
    private ArrayList<CD> cds;


    public Banda(String nome, EstiloEnum estilo) {
        this.nome = nome;
        this.estilo = estilo;
        this.cds = new ArrayList<CD>();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EstiloEnum getEstilo() {
        return this.estilo;
    }

    public void setEstilo(EstiloEnum estilo) {
        this.estilo = estilo;
    }

    public ArrayList<CD> getCds() {
        return cds;
    }

    public void setCds(ArrayList<CD> cds) {
        this.cds = cds;
    }

    @Override
    public String toString() {
        return "[nome=" + nome + ", estilo=" + estilo + "]";
    }

}
