import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);

        boolean problema = true;

        while (problema) {
            try {
                System.out.print("Digite seu nome: ");
                String nome = leitor.nextLine();

                System.out.print("Digite seu sobrenome: ");
                String sobrenome = leitor.nextLine();

                System.out.print("Informe sua idade: ");
                int idade = leitor.nextInt();

                System.out.print("Informe sua altura: ");
                double altura = leitor.nextDouble();
                System.out.println("");

                System.out.println("Cadastro realizado com sucesso!");
                problema = false;  // Se tudo correr bem, saímos do laço

            } catch (InputMismatchException error) {
                System.out.println("Erro: Os campos idade e altura precisam ser numéricos.");
                leitor.nextLine(); // Limpa a entrada incorreta
            }
        }

        leitor.close();
    }
}