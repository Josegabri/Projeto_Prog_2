package ClassesJogador;

public class Arqueiro extends Jogador {
    public Arqueiro(String nome) {
        super(nome);
    }

    @Override
    double dano() {
        return 10;
    }

    @Override
    double hp() {
        return 15;
    }

    @Override
    double st() {
        return 15;
    }

//    @Override
//    double danoBasico() {
//        return 0;
//    }
//
//    @Override
//    double habilidade() {
//        return 0;
//    }

}
