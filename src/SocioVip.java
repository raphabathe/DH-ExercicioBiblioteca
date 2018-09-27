public class SocioVip extends Socio{



    private Integer mensalidade;

    public SocioVip(String nome, String sobrenome, Integer numeroIdentificacao) {
        super(nome, sobrenome, numeroIdentificacao);
        setQuantiadeMaxima(15);
    }


    //    Getters and Setters


    public Integer getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(Integer mensalidade) {
        this.mensalidade = mensalidade;
    }
}
