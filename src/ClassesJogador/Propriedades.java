package ClassesJogador;

public abstract class Propriedades {
    public String nome;

    public Propriedades(String nome) {
        this.nome = nome;
    }

    public abstract double causarDano();
    public abstract double receberDano(double dano);
    public abstract double mostrarHp();
    public abstract double mostrarDano();
}
