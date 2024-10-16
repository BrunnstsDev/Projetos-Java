import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        System.out.println("Boletim Escolar");
        System.out.println("---------------");

        try (Scanner leitor = new Scanner(System.in)) {

        //Informações do aluno.
        System.out.print("Nome do Aluno: ");
        String nomeAluno = leitor.nextLine();

        System.out.print("Digite a media do aluno " + nomeAluno + ": ");
        int mediaAluno = leitor.nextInt();
        System.out.println("");

        if (mediaAluno >= 8 && mediaAluno <= 9){
            System.out.println("Aluno aprovado!");
            System.out.println("Media: " + mediaAluno);

        } else if (mediaAluno == 10) {
            System.out.println("Parabens! Voce alcancou a nota maxima.");
            System.out.println("Media: " + mediaAluno);

        } else if (mediaAluno >= 5 && mediaAluno < 7) {
            System.out.println("Aluno pendente.");
            System.out.println("Media: " + mediaAluno);

        } else {
            System.out.println("Aluno reprovado!");
        }
        }
    }
}
