package ClassesJogador;

public class Mago extends Jogador{
    protected double dano = 10;
    protected double hp = 20;
    protected double st = 10;
    public Mago(String nome) {
        super(nome);
    }

    @Override
    double causarDano() {
        return this.dano;
    }

    @Override
    double usarSt() {
        this.st -= 4;
        return this.dano + 4;
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
        return 0;
    }

    @Override
    double mostrarSt() {
        return this.st;
    }
}
