package ClassesInimigos;
// Inimigo Nível 1

public class Caveira extends Inimigo{
    protected double dano = 8;
    protected double hp = 17;
    protected double dropExp = 7;

    public Caveira(String nome) {
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
    @Override 
    public double mostrarDropexp(){
        return dropExp;
    }
}
