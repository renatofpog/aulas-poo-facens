public class App {
    public static void main(String[] args) {
        // estática = não muda de tamanho
        // homogêneo não mistura tipos

        Pessoa pessoas[] = new Pessoa[5];
    
        // Pessoa p = new Pessoa();
        // p.nome = "Renato";
        

        pessoas[0] = new Pessoa();
        pessoas[0].nome = "Renato";

        System.out.println(pessoas.length);
        System.out.println("Nome 1: " + pessoas[0].nome );
    }
}
