abstract class Pessoa {  // Classe abstrata
    //Variaveis protegidas, somente subclasses podem utilizar-las
    protected  String nome; 
    protected  String email;

    public Pessoa(String nome, String email) { //Construtor
        this.nome = nome;
        this.email = email;
    }
    public abstract  void exibirDetalhes(); //Método
}
