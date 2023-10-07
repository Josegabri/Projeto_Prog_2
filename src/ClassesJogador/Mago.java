package ClassesJogador;

public class Mago extends Jogador {

    public Mago(String nome) {
        super(nome);

    }

    @Override
    double dano() {
        return 20;
    }

    @Override
    double hp() {
        return 10;
    }

    @Override
    double st() {
        return 10;
    }

//    @Override
//    double danoBasico() {
//        return 0;
//    }
//
//
//    @Override
//    double habilidade() {
//        return 0;
//    }


}
