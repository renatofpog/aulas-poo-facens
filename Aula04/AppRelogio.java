public class AppRelogio {
    public static void main(String[] args) {
        Relogio r1 = new Relogio(12, 5, 12);
      /*   Relogio r2 = new Relogio(); */


/*         r1.setHora(12); */
        int horaAtual = r1.getHora();
        System.out.println("Hora no r1: " + horaAtual);
    }
}
