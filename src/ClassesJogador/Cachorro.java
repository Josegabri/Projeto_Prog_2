package ClassesJogador;

public class Cachorro extends Inimigo{
    protected double dano = 2;
    protected double hp = 20;

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    double causarDano() {
        return 2;
    }

    @Override
    double receberDano(double dano) {
        return 10;
    }

    @Override
    double mostrarHp() {
        return 0;
    }

    @Override
    double mostrarDano() {
        return 0;
    }
}
