package ClassesJogador;

public abstract class Jogador extends Propriedades{

    public Jogador(String nome) {
        super(nome);
    }
    abstract double usarSt();
    abstract double mostrarSt();
    public abstract void aumentarDano(double item);
    abstract void aumentarHp(double item);
    double mostrarExp;
    public abstract String aumentarNivel(double experi);
    abstract Integer mostrarNivel();
    public abstract void aumentarExp (double exper);
    public abstract double mostrarExp();
    public abstract void item();
    public abstract String nomeItem();  
}
