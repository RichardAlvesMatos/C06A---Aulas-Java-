import java.util.Random;

public class campoMinado {

    private int matriz[][] = new int[2][2];

    private int linhaBomba;
    private int colunaBomba;

    public campoMinado() {

        Random rand = new Random();
        this.linhaBomba = rand.nextInt(2);
        this.colunaBomba = rand.nextInt(2);
        this.matriz[linhaBomba][colunaBomba] = 1;
    }

    public boolean acertouBomba(int linha, int coluna ){

        return linha == linhaBomba && coluna == colunaBomba;
    }


}
