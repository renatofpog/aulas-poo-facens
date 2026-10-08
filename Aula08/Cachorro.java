public class Cachorro extends Animal {
    private boolean adestrado;

    public Cachorro(String nome, String raca, boolean adestrado) {
        super(nome, raca); // Super = Animal (super classe do cachorro)
        this.adestrado = adestrado;
    }

    @Override // Sobrescrita
    public String exibirDados() {
        return "Nome: " + getNome() + " raça: " + getRaca() + " Adestrado: " + adestrado;
    }

    @Override 
    public String toString() {
        return exibirDados();
    }
}
