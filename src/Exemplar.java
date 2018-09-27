public class Exemplar {


    private Livro livro;
    private Integer edicao;
    private String localizacao;

    public Exemplar(Livro livro) {
        this.livro = livro;
        livro.adicionarNovoExemplar(this);
    }


//    Getters and Setters

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Integer getEdicao() {
        return edicao;
    }

    public void setEdicao(Integer edicao) {
        this.edicao = edicao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
