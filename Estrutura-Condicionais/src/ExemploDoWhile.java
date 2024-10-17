import java.util.Random;

public class ExemploDoWhile {
  public static void main(String[] args) {
        System.out.println("Discando...");

        //Faça {Bloco de comandos} enquanto (Parâmetro)

        do {
            System.out.println("tocando...");
        } while (tocando());

        System.out.println("AlÔ!!!");

    } private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        
        return ! atendeu;
    }

}

