import java.util.Scanner;
public class ExercicioTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Digite seu peso: ");
        double peso = input.nextDouble();

        System.out.println("Digite sua altura: ");
        double altura = input.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);

        if(imc < 18.5){
            System.out.println("Classificação: MAGREZA");
        }
        else if((imc >= 18.5) && (imc < 24.9)) {
            System.out.println("Classificação: NORMAL");
        }
        else if ((imc >=25) && (imc < 29.9)) {
            System.out.println("Classificação: SOBREPESO GRAU I");
        }
        else if ((imc >=30.0) && (imc < 39.9)) {
            System.out.println("Classificação: OBESIDADE GRAU II");
        }
        else System.out.println("OBESIDADE GRAU III");
    }
}