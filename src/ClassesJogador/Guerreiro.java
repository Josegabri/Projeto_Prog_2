package ClassesJogador;

public class Guerreiro extends Jogador{

    protected double dano = 10;
    protected double hp = 25;
    protected double st = 10;

    public Guerreiro(String nome) {
        super(nome);
    }

    @Override
    double causarDano() {
        return this.dano;
    }

    @Override // ainda para ser alterado
    double usarSt() {
        this.st -= 7 ;
        return this.dano+4;
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

    @Override
    double mostrarSt() {
        return this.st;
    }

    @Override
    void aumentarDano(double item) {
        this.dano += item;
    }

    @Override
    void aumentarHp(double item) {
    }
}

