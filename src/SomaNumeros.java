import java.util.Scanner;
public class SomaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        int resultado = numero;
    }
    int SomaNumeros (int resultado) {
        for (int i = 1; i < resultado; i++);
        return resultado;
    }
}
