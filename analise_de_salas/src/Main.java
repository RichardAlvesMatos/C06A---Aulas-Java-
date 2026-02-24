import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int caso;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos alunos há na sala? ( 10, 20 ou 30 )");

        caso = entrada.nextInt();

        switch(caso){

            case 10, 20:

                System.out.println("\nA turma devera ter aula na sala I-16");

            break;

            case 30:

                System.out.println("\nA turma devera ter aula na sala I-22");

            break;

            default:

                System.out.println("\nSala não encontrada!");

            break;

        }
    }
}