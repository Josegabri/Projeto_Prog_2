package ClassesInimigos;
// Inimigo Nível 1 

public class Fungo extends Inimigo{
    protected double dano = 3;
    protected double hp = 15;

    public Fungo(String nome) {
        super(nome);
    }

    @Override
    public double causarDano() {
        return this.dano;
    }

    @Override
    public double receberDano(double dano) {
        this.hp -= dano;
        return this.hp;
    }

    @Override
    public double mostrarHp() {
        return this.hp;
    }

    @Override
    public double mostrarDano() {
        return this.dano;
    }
}
