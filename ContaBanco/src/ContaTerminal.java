import java.util.Scanner;

public class ContaTerminal {

public static void main(String[] args) {

    Scanner Leitor = new Scanner(System.in);

    System.out.println("Banco Digital");
    System.out.println("-------------");
    System.out.println("Digite o numero da agencia:");
    String numeroAgencia = Leitor.nextLine();
    System.out.println(numeroAgencia);

}

}
