public class Pessoa {
    // atributos = caricterísticas de classe
    int idade;
    String nome;

    // ações = métodos
    void apresentar() {
        System.out.println("Olá! Eu sou " + nome);
    }

    void classificarIdade() {
        if(idade > 17) {
            System.out.println("Eu sou maior de idade");
        } else {
            System.out.println("Eu sou menor de idade");
        }
    }
}

