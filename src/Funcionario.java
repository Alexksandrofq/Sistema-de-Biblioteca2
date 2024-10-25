public class Funcionario extends Pessoa{//criação da classe Funcionario que está herdando da classe Pessoa
    //variaveis do tipo String, privadas 
    private String matricula;
    private String cargo;

    public Funcionario(String nome, String email, String matricula, String cargo) {//construtor 
        super(nome, email);
        this.matricula = matricula;
        this.cargo = cargo;
    }
    @Override
    public void exibirDetalhes(){//método

    };
}
