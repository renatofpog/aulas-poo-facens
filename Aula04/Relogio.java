public class Relogio {
    private int hora, minuto, segundo;

    // Construtor
    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
    }

    // Sobrecarga de Construtor
    public Relogio() {
        
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int novaHora) {
        if(novaHora > -1 && novaHora < 24) {
            hora = novaHora;
        }
    }
}
