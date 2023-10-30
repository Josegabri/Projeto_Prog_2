package ClassesJogador;

public class Caveira extends Inimigo{
    protected double dano = 8;
    protected double hp = 20;
    public Caveira(String nome) {
        super("caveira");
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
