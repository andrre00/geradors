import java.util.Random;
import java.util.Scanner;

public class GeradorDeSenhas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho desejado para a senha: ");
        int tamanho = scanner.nextInt();

        System.out.print("Incluir letras maiúsculas? (s/n): ");
        boolean maiusculas = scanner.next().equalsIgnoreCase("s");

        System.out.print("Incluir letras minúsculas? (s/n): ");
        boolean minusculas = scanner.next().equalsIgnoreCase("s");

        System.out.print("Incluir números? (s/n): ");
        boolean numeros = scanner.next().equalsIgnoreCase("s");

        String caracteres = "";
        if (maiusculas) caracteres += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if (minusculas) caracteres += "abcdefghijklmnopqrstuvwxyz";
        if (numeros) caracteres += "0123456789";

        String senha = gerarSenha(tamanho, caracteres);
        System.out.println("Senha gerada: " + senha);
    }

    public static String gerarSenha(int tamanho, String caracteres) {
        StringBuilder senha = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < tamanho; i++) {
            int indice = random.nextInt(caracteres.length());
            senha.append(caracteres.charAt(indice));
        }

        return senha.toString();
    }
}