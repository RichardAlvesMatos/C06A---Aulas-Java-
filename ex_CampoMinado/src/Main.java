import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        campoMinado jogo = new campoMinado();

        int escolhasPercorridas = 0;
        int escolhasSeguras = 2;
        int escolhasTotais = 4;

        boolean jogoAcabou = false;

        System.out.println("Escolha uma casa no campo minado 2x2 (digite primeiro a linha e logo apos a coluna)");

        while( escolhasPercorridas < escolhasSeguras && jogoAcabou == false){

            System.out.println("Casas seguras escolhidas: " + escolhasPercorridas);

            int l = entrada.nextInt();
            l--;

            int c = entrada.nextInt();
            c--;

            if(jogo.acertouBomba( l, c )){

                System.out.println("voce pisou na bomba, o jogo acabou!");
                jogoAcabou = true;

            } else {

                System.out.println("Escolha segura, pode continuar");
                escolhasPercorridas++;
            }
        }

        if( jogoAcabou == false ){

            System.out.println("Parabens, voce ganhou!");

        }

    }
}