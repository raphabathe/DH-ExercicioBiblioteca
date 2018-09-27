import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> listaDeLivros = new ArrayList<>();
    private List<Socio> listaDeSocios = new ArrayList<>();
    private List<Emprestimo> listaEmprestimos = new ArrayList<>();





    public void emprestar(List<Integer> umaListaDeISBN, Integer umNumeroDeIdentificacao) {

        for (Integer isbn : umaListaDeISBN) {

            Livro livroEmprestar = buscarLivroPeloISBN(isbn);
            Socio socioBuscado = buscarSocioPelaIdentificacao(umNumeroDeIdentificacao);
            if (socioBuscado.temCapacidadeDisponivel() && livroEmprestar.temExemplaresDisponiveis()) {
                socioBuscado.pegarEmprestadoUmExemplar(livroEmprestar.getListaExemplares().get(0));
                Emprestimo emprestimo = new Emprestimo(livroEmprestar.getListaExemplares().get(0), socioBuscado);
                listaEmprestimos.add(emprestimo);
                livroEmprestar.emprestarExemplar();
                System.out.println("O exemplar " + livroEmprestar.getNome() + " foi retirado por " + socioBuscado.getNome() + " " + socioBuscado.getSobrenome());

            }
        }
    }

    public void devolver(List<Exemplar> exemplares, Integer numeroDeIdentificacao) {
        Socio socio1 = null;
        for (Exemplar umExemplar : exemplares) {
            for (Socio socio : listaDeSocios) {
                if (socio.getNumeroIdentificacao().equals(numeroDeIdentificacao)) {
                    socio.devolverExemplar(umExemplar);
                    socio1 = socio;
                }
            }
            for (Livro livro :listaDeLivros){
                if (livro.getISBN().equals(umExemplar.getLivro().getISBN())){
                    livro.receberExemplar(umExemplar);
                }
            }
            System.out.println("Livro " +umExemplar.getLivro().getNome() +" devolvido por " +socio1.getNome() + " " +socio1.getSobrenome());
        }
    }



    public void emprestar(Integer codigoISBN, Integer numeroIdentificacao){
        Livro livroEmprestar = buscarLivroPeloISBN(codigoISBN);
        Socio socioBuscado = buscarSocioPelaIdentificacao(numeroIdentificacao);
        if (socioBuscado.temCapacidadeDisponivel() && livroEmprestar.temExemplaresDisponiveis()){
            socioBuscado.pegarEmprestadoUmExemplar(livroEmprestar.getListaExemplares().get(0));
            Emprestimo emprestimo = new Emprestimo(livroEmprestar.getListaExemplares().get(0),socioBuscado);
            listaEmprestimos.add(emprestimo);
            livroEmprestar.emprestarExemplar();
            System.out.println("O exemplar " +livroEmprestar.getNome() + " foi retirado por " +socioBuscado.getNome() + " " +socioBuscado.getSobrenome());

        }
    }

    public void devolver(Exemplar umExemplar, Integer numeroDeIdentificacao){
        Socio socioEmQuestao = null;
        for (Socio socio : listaDeSocios) {
            if (socio.getNumeroIdentificacao().equals(numeroDeIdentificacao)){
                socio.devolverExemplar(umExemplar);
                socioEmQuestao = socio;
            }
        }

        for (Livro livro :listaDeLivros){
            if (livro.getISBN().equals(umExemplar.getLivro().getISBN())){
                livro.receberExemplar(umExemplar);
            }
        }
        System.out.println("Livro " +umExemplar.getLivro().getNome() +" devolvido por " +socioEmQuestao.getNome() + " " +socioEmQuestao.getSobrenome() );
    }




    public Socio buscarSocioPelaIdentificacao(Integer numeroIdentificacao){
        Socio socioBuscado = null;
        for ( Socio socio : listaDeSocios) {
            if (socio.getNumeroIdentificacao().equals(numeroIdentificacao)){
                socioBuscado = socio;
            }
        }
        return socioBuscado;
    }

    public Livro buscarLivroPeloISBN(Integer ISBN){
       Livro livroPesquisado = null;
        for (Livro livro:listaDeLivros) {
            if (livro.getISBN().equals(ISBN)){
                livroPesquisado = livro;
            }
        }
        return livroPesquisado;
    }


//    Getters and Setters

    public List<Livro> getListaDeLivros() {
        return listaDeLivros;
    }

    public void setListaDeLivros(List<Livro> listaDeLivros) {
        this.listaDeLivros = listaDeLivros;
    }

    public List<Socio> getListaDeSocios() {
        return listaDeSocios;
    }

    public void setListaDeSocios(List<Socio> listaDeSocios) {
        this.listaDeSocios = listaDeSocios;
    }

    public List<Emprestimo> getListaEmprestimos() {
        return listaEmprestimos;
    }

    public void setListaEmprestimos(List<Emprestimo> listaEmprestimos) {
        this.listaEmprestimos = listaEmprestimos;
    }
}
