public class Kart {

    Motor motor;


}



public class Main {
    public static void main(String[] args) {

        Kart kart1 = new Kart();
        Kart kart2 = new Kart();

        Piloto p1 = new Piloto();
        Piloto p2 = new Piloto();
        p1.nome = "Chris";
        p1.nome = "Pizzonin";

        kart1.piloto = p2;
        kart2.piloto = p1;

        kart1.motor.cilindradas = "100";
    }
}

public class Motor {

    double cilindradas;
}

public class Piloto {

    String nome;
}