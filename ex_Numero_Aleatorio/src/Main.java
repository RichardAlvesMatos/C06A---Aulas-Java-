import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        int x = rand.nextInt(10) + 1;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha um número aleatorio de 1 a 10");

        int num = entrada.nextInt();

        do{

            System.out.println("O número selecionado é diferente do número aleatorio!");
            num = entrada.nextInt();
        } while( num != x );

        System.out.println("Voce encontrou o número aleatório, era " + x + "!!!");

    }
}