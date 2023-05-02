import java.util.Scanner;
public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float C;

        System.out.print("Informe a temperatura em Celsius: ");
        C = input.nextFloat();

        System.out.print("A temperatura em Fahrenheit é: "+(9 * C + 160) / 5);
    }
}
