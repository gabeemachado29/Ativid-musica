public class Banda {
    
    private String nome;
    private EstiloEnum estilo;
    private CD[] cds;
    private Musico[] musicos;

    public Banda(String nome, EstiloEnum estilo, CD[] cds, Musico[] musicos) {
        this.nome = nome;
        this.estilo = estilo;
        this.cds = cds;
        this.musicos = musicos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CD[] getCds() {
        return cds;
    }

    public void setCds(CD[] cds) {
        this.cds = cds;
    }

    public Musico[] getMusicos() {
        return musicos;
    }

    public void setMusicos(Musico[] musicos) {
        this.musicos = musicos;
    }

    public EstiloEnum getEstilo() {
        return estilo;
    }

    public void setEstilo(EstiloEnum estilo) {
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
