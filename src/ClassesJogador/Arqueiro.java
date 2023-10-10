package ClassesJogador;

public class Arqueiro extends Jogador{
    public Arqueiro(String nome) {
        super(nome);
    }

    @Override
    public double dano() {
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
