package ClassesJogador;

public class Guerreiro extends Jogador {
    public Guerreiro(String nome) {
        super(nome);
    }

    @Override
    double dano() {
        return 15;
    }

    @Override
    double hp() {
        return 20;
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
//    @Override
//    double habilidade() {
//        return 0;
//   }

}
