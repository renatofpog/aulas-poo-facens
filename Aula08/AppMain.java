public class AppMain {
    public static void main(String[] args) {
        Animal a1 = new Animal("Animal");
        Animal a2 = new Animal(12);
        Animal a3 = new Animal("Animal", "Raça");
        Cachorro c = new Cachorro("Lulu", "Dalmata", true);
    
    //System.out.println("Nome do cachorro: " + c.getNome());
    System.out.println(c.exibirDados());
    System.out.println(c.toString());
}
}
