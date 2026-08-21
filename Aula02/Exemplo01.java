/**
 * Exemplo01
 */
public class Exemplo01 {

    public static void main(String[] args) {
        System.out.println("Boa noite!");

        // int (numero), double (numerico com decimal), boolean (verdadeiro/falso), char (1 letra), String ((Unica com Letra Maiuscula), texto)
        int numero;
        numero = 123;

        double numero2;
        numero2 = 5.9999;

        numero = (int) numero2; // casting = forçando uma transformação temporária no DADO NÃO NA VARIÁVEL

        System.out.println(numero);
        System.out.println(numero2);
    }
    
}