package ClassesInimigos;

public class Cobra_Peconhenta extends Inimigo {
    protected double dano = 8;
    protected double hp = 13;
    protected double dropExp = 5;
    protected int nivel = 1;


    public Cobra_Peconhenta (String nome, int nivel) {
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
        this.nivel -= fase;
        this.dano += this.dano*(this.nivel*10.0/100.0);
        this.hp += this.hp*(this.nivel*10.0/100.0);
        this.nivel = fase;
    }

    @Override
    public int getNivel() {
        return this.nivel;
    }
}
