package ClassesJogador;

public class Caveira extends Inimigo{
    protected double dano = 10;
    protected double hp = 20;
    public Caveira(String nome) {
        super("caveira");
    }

    @Override
    double causarDano() {
        return 0;
    }

    @Override
    double receberDano(double dano) {
        return 0;
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
