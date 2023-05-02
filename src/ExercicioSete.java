import java.util.Scanner;
public class ExercicioSete {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double CotacaoDolar, ValorDolar, ValorReal;

        System.out.println("Digite a cotação do dólar: ");
        CotacaoDolar = entrada.nextDouble();

        System.out.println("Digite o valor em dolares: ");
        ValorDolar = entrada.nextDouble();

        ValorReal = CotacaoDolar*ValorDolar;

        System.out.println("O valor em reais é: "+ValorReal);
    }
}
