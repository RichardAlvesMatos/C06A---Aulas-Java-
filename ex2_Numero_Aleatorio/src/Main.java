import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int x = rand.nextInt(10) + 1;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Tente advinhar o número aleatório de 1 a 10!");

        int num = entrada.nextInt();

        do{

            if( num > x ){

                System.out.println("\nO número digitado é maior que o número aleatório");
                num = entrada.nextInt();
            }else if( num < x ) {

                System.out.println("\nO número digitado é menor que o número aleatório");
                num = entrada.nextInt();
            }
        }while( num != x );

        System.out.println("\nVocê acertou o número aleatório, ele era " + x + "!!!");

    }
}