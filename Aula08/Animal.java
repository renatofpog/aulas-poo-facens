public class Animal extends Object{
    private String nome;
    private String raca;
    private int idade;

    // Construtor Default = Padrão
    public Animal() {

    }

    // Sobrecarga = overload
    public Animal(String nome) {
        // This se refe ao próprio objeto
        // this.nome é o atributo, e nome é o parâmetro.
        this.nome = nome;
    }

    public Animal(String novoNome, String novaRaca) {
        nome = novoNome;
        raca = novaRaca;
    }

    public Animal(int novaIdade) {
        idade = novaIdade;
    }

    public String getNome() {
        return nome;
    }


    public String getRaca() {
        return raca;
    }

    public String exibirDados() {
        return "Nome: " + nome + " raça: " + raca;
    }
}
