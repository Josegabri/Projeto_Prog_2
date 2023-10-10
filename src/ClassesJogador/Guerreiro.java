package ClassesJogador;

public class Guerreiro extends Jogador{
    public Guerreiro(String nome) {
        super(nome);
    }

    @Override
    double dano() {
        return 10;
    }

    @Override
    double hp() {
        return 10;
    }

    @Override
    double st() {
        return 10;
    }
}

