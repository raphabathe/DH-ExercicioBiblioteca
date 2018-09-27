import java.util.ArrayList;
import java.util.List;

public class Livro {


    private String nome;
    private Integer ISBN;
    private String autor;
    private List<Exemplar> listaExemplares = new ArrayList<>();


    public Livro(String nome, Integer ISBN, String autor) {
        this.nome = nome;
        this.ISBN = ISBN;
        this.autor = autor;
        listaExemplares = new ArrayList<>();
    }

    public void adicionarNovoExemplar(Exemplar umExemplar){
        if (umExemplar.getLivro().equals(this)){
            listaExemplares.add(umExemplar);
            System.out.println("Exemplar do livro: " +getNome() +" adicionado com sucesso no estoque.");
        }else{
            System.out.println("O exemplar não corresponde ao livro selecionado.");
        }
    }

    public Boolean temExemplaresDisponiveis(){
        if (listaExemplares.isEmpty()){
            return false;
        }else return true;
    }


    public Exemplar emprestarExemplar(){
        Exemplar exemplar = null;
        if (listaExemplares.isEmpty()){
            System.out.println("Não tem exemplares disponíveis para emprétimo.");
        }else{
            exemplar = listaExemplares.get(0);
            listaExemplares.remove(0);

        }
        return exemplar;
    }

    public void receberExemplar(Exemplar umExemplar){
        listaExemplares.add(umExemplar);
    }











//    Getters and Setters


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getISBN() {
        return ISBN;
    }

    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


    public List<Exemplar> getListaExemplares() {
        return listaExemplares;
    }

    public void setListaExemplares(List<Exemplar> listaExemplares) {
        this.listaExemplares = listaExemplares;
    }
}
