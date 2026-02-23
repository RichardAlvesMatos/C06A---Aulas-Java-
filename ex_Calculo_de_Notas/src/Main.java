import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float NPA, NP3, NFA;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a NPA: ");
        NPA = entrada.nextFloat();

        if( NPA >= 60 ){

            System.out.println("\nO Aluno(a) passou!");

        } else if ( NPA >=30 ) {

            System.out.println("\nDigite a nota da NP3: ");
            NP3 = entrada.nextFloat();
            if ( 50 <= ( NPA + NP3 ) / 2 ){

                System.out.println("\nO Aluno(a) passou!");
            }else {

                System.out.println("\nO Aluno(a) nao passou!");
            }

        } else{

            System.out.println("\nO aluno(a) nao passou!");


        }
    }
}