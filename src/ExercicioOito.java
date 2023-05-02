import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double PrecoCusto, acrescimo, acrescimoReal, ValorVenda;

        System.out.println("Informe o preço de custo");
        PrecoCusto = entrada.nextDouble();

        System.out.println("Informe o percentual de acréscimo");
        acrescimo = entrada.nextDouble();

        acrescimoReal = PrecoCusto * acrescimo / 100;
        ValorVenda = acrescimoReal + PrecoCusto;

        System.out.println("Valor de venda:R$ ");
    }
}
