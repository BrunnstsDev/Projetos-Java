import java.util.Scanner;

public class CondicaoTernaria {
    public static void main(String[] args) {
        System.out.println("Boletim Escolar");
        System.out.println("---------------");

        try (Scanner leitor = new Scanner(System.in)) {

        //Informações do aluno.
        System.out.print("Nome do Aluno: ");
        String nomeAluno = leitor.nextLine();

        System.out.print("Digite a media do aluno " + nomeAluno + ": ");
        int mediaAluno = leitor.nextInt();
        
        String resultado = mediaAluno >= 6 ? "Aluno aprovado!" : "Reprovado!";   
        System.out.println(resultado);    

        }
    }  
}
