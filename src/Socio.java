import java.util.ArrayList;
import java.util.List;

public class Socio {


    private String nome;
    private String sobrenome;
    private Integer numeroIdentificacao;
    private List<Exemplar> listaRetirados = new ArrayList<>();
    private Integer quantiadeMaxima;








    public Boolean temCapacidadeDisponivel(){
        if (listaRetirados.size() < quantiadeMaxima){
            return true;
        }else  return false;
    }




    public void pegarEmprestadoUmExemplar(Exemplar umExemplar){
        listaRetirados.add(umExemplar);
    }

    public void devolverExemplar(Exemplar umExemplar){
        listaRetirados.remove(umExemplar);
    }



//    Constructors

    public Socio(String nome, String sobrenome, Integer numeroIdentificacao) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numeroIdentificacao = numeroIdentificacao;
        setQuantiadeMaxima(3);
    }


//    Getters and Setters


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public void setNumeroIdentificacao(Integer numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
    }

    public List<Exemplar> getListaRetirados() {
        return listaRetirados;
    }

    public void setListaRetirados(List<Exemplar> listaRetirados) {
        this.listaRetirados = listaRetirados;
    }

    public Integer getQuantiadeMaxima() {
        return quantiadeMaxima;
    }

    public void setQuantiadeMaxima(Integer quantiadeMaxima) {
        this.quantiadeMaxima = quantiadeMaxima;
    }
}
