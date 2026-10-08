public class Main {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("Chevrolet", "Astra", 10.5);
    
        System.out.println(v1.exibir());
        
        v1.abastecerVeiculo(30);

        System.out.println(v1.exibir());
        System.out.println("O consumo é: " + v1.getConsumo());
    }
}
