package ClassesJogador;

public class Guerreiro extends Jogador{

    protected double dano = 10;
    protected double hp = 20;
    protected double st = 10;

    public Guerreiro(String nome) {
        super(nome);
    }

    @Override
    double causarDano() {
        return 0;
    }

    @Override
    double usarSt() {
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

    @Override
    double mostrarSt() {
        return 0;
    }
}

