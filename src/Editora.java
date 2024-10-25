//importação das bibliotecas
import java.util.ArrayList;
import java.util.List;

public class Editora {//criação da classe editora
    //variáveis livro, que tem matriz livro e editora tipo string e são privadas
    private List<Livro> livros;
    private String editora;

    public Editora(String editora){//construtor
        this.editora = editora;
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){//método
        livros.add(livro);
    }
}
