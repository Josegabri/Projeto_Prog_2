package ClassesJogador;

public class Cachorro extends Inimigo{
    protected double dano = 2;
    protected double hp = 15;

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    double causarDano() {
        return this.dano;
    }

    @Override
    double receberDano(double dano) {
        this.hp -= dano;
        return this.hp;
    }

    @Override
    double mostrarHp() {
        return this.hp;
    }

    @Override
    double mostrarDano() {
        return this.dano;
    }
}
