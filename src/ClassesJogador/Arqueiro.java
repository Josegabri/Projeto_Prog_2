package ClassesJogador;

public class Arqueiro extends Jogador{

    protected double dano = 10;
    protected double hp = 20;
    protected double st = 10;

    public Arqueiro(String nome) {
        super(nome);
    }

    @Override
    double causarDano() {
        return this.dano;
    }

    @Override // alterar
    double usarSt() {
        return 0;
    }

    @Override
    double mostrarSt() {
        return this.st;
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
