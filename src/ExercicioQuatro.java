import java.util.Scanner;
public class ExercicioQuatro {
    Scanner sc = new Scanner(System.in);
    int MenorValor = 0;
    int VetorNumeros[] = new int [10];

    for(int i = 0; i < VetorNumeros.length; i++) {

        if( VetorNumeros[i] < MenorValor){

            MenorValor = VetorNumeros[i];

        }
    }
}




