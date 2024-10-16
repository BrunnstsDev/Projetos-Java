import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"Breno", "Joao", "Julia", "Luisa", "Pedro"};
        for(String candidato: candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato realizado com sucesso");
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) 
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
        else 
            System.out.println("Nao conseguimos contato com " + candidato + ", numero maximo de tentativas " + tentativasRealizadas + " realizadas");
        
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }


    static void imprimirSelecionados() {
        String [] candidatos = {"Breno", "Joao", "Julia", "Luisa", "Pedro"};

        System.out.println("Imprimindo lista de candidatos selecionados: ");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de n" + (indice+1) + " e o " + candidatos[indice]);
        }
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"Bruno", "Breno", "Joao", "Julia", "Luisa", "Pedro", "Geovanna", "Thalita", "Gabi", "Tales"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos [candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salario " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para candidato");
        } else if (salarioBase == salarioPretendido) 
            System.out.println("Ligar para candidato com contra proposta");
        else {
             System.out.println("Aguardando os resultados dos demais candidatos");
        }
    }
}