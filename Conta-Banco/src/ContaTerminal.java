import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner Leitor = new Scanner(System.in);

        System.out.println("Banco Digital");
        System.out.println("-------------");
        System.out.print("Digite seu nome: ");
        String nome = Leitor.nextLine(); 

        System.out.print("Informe o número da sua conta: ");
        int numeroConta = Leitor.nextInt();
        Leitor.nextLine();  // Consome a nova linha

        System.out.print("Digite o número da agência: ");
        String numeroAgencia = Leitor.nextLine();

        System.out.print("Informe o valor que deseja depositar: ");
        double saldo = Leitor.nextDouble();

        System.out.println("");
        System.out.println("Cadastro realizado com sucesso!");

        System.out.println("-------------------------------");
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

    }

}