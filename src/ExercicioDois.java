import java.util.Scanner;
public class ExercicioDois {
    public static void main(String[] args) {
        Scanner NomeUsuario = new Scanner(System.in);
        String NomeDigitado = String.valueOf(NomeUsuario);

        System.out.println("Digite um nome");
        NomeDigitado();
        NomeDigitado = NomeUsuario.next();
    }
    public static String NomeDigitado(String main) {
        System.out.println("Seu nome é : " +NomeDigitado());
    }
}


