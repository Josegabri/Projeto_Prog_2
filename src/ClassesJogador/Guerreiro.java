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
        return 0;
    }

    @Override
    double usarSt() {
        return 0;
    }

    @Override
    double receberDano(double dano) {
        System.out.println("Você recebeu " + this.dano + " de dano");
        return 0;
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
        return 0;
    }
}

