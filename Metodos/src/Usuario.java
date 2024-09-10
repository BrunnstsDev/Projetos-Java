package Metodos.src;

public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);

        smartTv.aumentar();
        System.out.println("Novo status -> Volume: " + smartTv.volume);

        smartTv.altCanal();
        System.out.println("Novo status -> Canal: " + smartTv.canal);

        smartTv.novoCanal(13);
        System.out.println(smartTv.canal);
       
    }
}
