import java.util.Scanner;
public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[6];
        int menor;

        System.out.println("MENOR NUMERO");

        for (int i = 0; i < 6; i++) {
            System.out.println("Digite os numeros: ");
            numeros[i] = sc.nextInt();
        }
        menor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {

            if (menor > numeros[i]) {

                menor = numeros[i];
            }
        }
        System.out.println("O menor numero e: " + menor);
    }
}






