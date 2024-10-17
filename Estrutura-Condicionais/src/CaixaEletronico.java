public class CaixaEletronico {
    public static void main(String[] args) {
            double saldo = 25.0;
            double valorSolicitado = 26.0;

            if (valorSolicitado < saldo) {
                
                saldo = saldo - valorSolicitado;
                System.out.println("Saque no valor de R$ " + valorSolicitado + " realizado com sucesso.");
                System.out.println("Saldo atual: " + saldo);
            
            } else {
                System.out.println("Valor indisponivel.");
                System.out.println("Saldo atual: R$ " + saldo);
            }
    }
}
