public class Musica {
    
    private String titulo;
    private int duracao;
    private Musico musicos;

    public Musica(String titulo, int duracao, Musico musicos) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.musicos = musicos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Musico getMusicos() {
        return musicos;
    }

    public void setMusicos(Musico musicos) {
        this.musicos = musicos;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
