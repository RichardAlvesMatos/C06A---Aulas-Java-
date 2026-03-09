public class Main {
    public static void main(String[] args) {

        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.nome = "Chris";
        z2.nome = "Pizzonin";

        z1.vida = 100;
        z2.vida = 200;

        System.out.println(z1.mostraVida());
        System.out.println(z2.mostraVida());

        z2.transfereVida(z1, 50);

        System.out.println(z1.mostraVida());
        System.out.println(z2.mostraVida());
    }
}