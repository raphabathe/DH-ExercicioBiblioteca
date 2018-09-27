import java.util.Date;

public class Emprestimo {


    private Exemplar exemplar;
    private Socio socio;
    private Date data;


    public Emprestimo(Exemplar exemplar, Socio socio) {
        this.exemplar = exemplar;
        this.socio = socio;
        this.data = new Date();
    }


    public Exemplar getExemplar() {
        return exemplar;
    }

    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
