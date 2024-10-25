public class Autor extends Pessoa {//criação da classe Autor que está herdando da Classe Pessoa
    //variavel do tipo String , privada
    private String biografia;

    public Autor(String nome, String email, String biografia) {//Construtor
        super(nome, email);
        this.biografia = biografia;
    }

    @Override
    public void exibirDetalhes() {//método
        System.out.println("Autor: " + nome + " - Email: " + email);
        System.out.println("Biografia: " + biografia);
    }

    @Override
    public String toString() {//método
        return "\nAutor: " + nome + "- E-mail: " + email +
                "\nBiográfia: " + biografia;
    }
}
