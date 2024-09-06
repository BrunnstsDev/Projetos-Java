public class operadoresaula2 {
    public static void main(String[] args) {

        String nomeCompleto = "Bruno" + "Santos";
        System.out.println(nomeCompleto);

        //Atenção: O operador de adição (+), quando utilizados em variáveis do tipo texto, realizará a "concatenação de textos".

        String concatenacao = ("?");

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

    }
}
