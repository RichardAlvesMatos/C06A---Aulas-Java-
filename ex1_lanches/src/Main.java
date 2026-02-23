import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        int hora_1;
        int hora_2;
        int hora_3;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor de lanches vendidos na primeira hora:");
        hora_1 = entrada.nextInt();
        System.out.println("\nDigite o valor de lanches vendidos na segunda hora:");
        hora_2 = entrada.nextInt();
        System.out.println("\nDigite o valor de lanches vendidos na terceira hora:");
        hora_3 = entrada.nextInt();

        int total_lanches = ( hora_1 + hora_2 + hora_3 );
        float media_lanches = (float) total_lanches / 3;

        System.out.println( "\nO total de lanches vendidos foi " + total_lanches );

        System.out.println( "\nA media de lanches vendidos por hora foi " + media_lanches );
    }
}