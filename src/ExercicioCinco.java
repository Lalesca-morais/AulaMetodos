import java.util.Scanner;
import java.text.DecimalFormat;
public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        String nome;
        Double salariofixo, totaldevendas, total;

        System.out.println("Digite seu nome: ");
        nome = input.next();

        System.out.println("Digite seu salário fixo: ");
        salariofixo = input.nextDouble();

        System.out.println("Digite seu total de vendas no mês: ");
        totaldevendas= input.nextDouble();

        total = salariofixo + totaldevendas * 0.15;

        System.out.println("O seu nome é " +nome+ "seu salário fixo é R$ " +salariofixo+ "e o salário no final do mês é: " +totaldevendas);

    }
}
