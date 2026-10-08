public class Veiculo {
    private String marca;
    private String modelo;
    private int kmRodados;
    private double combustivel;
    private double consumo;

    // CONSTRUTORES
    public Veiculo(String marca, String modelo, int kmRodados, double combustivel, double consumo) {
        this.marca = marca;
        this.modelo = modelo;
        this.kmRodados = kmRodados;
        this.combustivel = combustivel;
        this.consumo = consumo;
    }
    
    public Veiculo(String marca, String modelo, double consumo) {
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
    }

    // MÉTODOS
    public String exibir() {
        return "Carro: " + marca + " - " + modelo + " km " + kmRodados + " Combustivel: " + combustivel;
    }

    public void abastecerVeiculo(double combustivel) {
        if(combustivel > 0) {
            this.combustivel += combustivel; 
        }
    }

    public double getConsumo() {
        return consumo;
    }
}
