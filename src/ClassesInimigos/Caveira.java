package ClassesInimigos;
// Inimigo Nível 1

public class Caveira extends Inimigo{
    protected double dano = 8;
    protected double hp = 17;
    protected double dropExp = 7;
    protected int nivel = 1;


    public Caveira(String nome, int nivel) {
        super(nome);
        this.nivel = nivel;
        this.nivel(nivel);
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

    @Override
    public void nivel(int fase) {
        this.dano += this.dano*(fase*10/100);
        this.hp += this.hp*(fase*10/100);
        this.nivel = fase;
    }

    @Override
    public int getNivel() {
        return this.nivel;
    }
}