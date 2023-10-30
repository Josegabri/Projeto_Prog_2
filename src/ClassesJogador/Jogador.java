package ClassesJogador;

public abstract class Jogador extends Propriedades{

    public Jogador(String nome) {
        super(nome);
    }
    abstract double usarSt();
    abstract double mostrarSt();
    public abstract void aumentarDano(double item);
    abstract void aumentarHp(double item);
}
