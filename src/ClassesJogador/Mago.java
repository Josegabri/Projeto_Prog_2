package ClassesJogador;

public class Mago extends Jogador{
    protected double dano = 7;
    protected double hp = 20;
    protected double st = 10;
    
    public Mago(String nome) {
        super(nome);
    }

    @Override
     public double causarDano() {
        return this.dano;
    }

    @Override
    double usarSt() {
        this.st -= 4;
        return this.dano + 4;
    }

    @Override
    public double receberDano(double dano) {
        this.hp -= dano;
        return this.hp;
    }

    @Override
    public
    double mostrarHp() {
        return this.hp;
    }

    @Override
    public
    double mostrarDano() {
        return this.dano;
    }

    @Override
    double mostrarSt() {
        return this.st;
    }

    @Override
    public
    void aumentarDano(double item) {
        dano = item;
    }

    @Override
    void aumentarHp(double item) {
    }
}
