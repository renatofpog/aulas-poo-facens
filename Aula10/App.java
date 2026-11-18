public class App {
    public static void main(String[] args) {
       // Pessoa p = new Pessoa();
        Aluno a = new Aluno();
        Professor p = new Professor();

        a.nome = "Renato";
        p.nome = "Fillipo";

        a.exibirNome();
        p.exibirNome();
    }
}
