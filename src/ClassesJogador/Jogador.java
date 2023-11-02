package ClassesJogador;

public abstract class Jogador extends Propriedades{

    public Jogador(String nome) {
        super(nome);
    }
    abstract double usarSt();
    abstract double mostrarSt();
    public abstract void aumentarDano(double item);
    abstract void aumentarHp(double item);
    abstract void aumentarSt(double item);
    double mostrarExp;
    public abstract String aumentarNivel(double experi);
    abstract Integer mostrarNivel();
    public abstract void aumentarExp (double exper);
    public abstract double mostrarExp();
    public abstract Item equiparItem();
    public abstract void item(double dano, String nome, String tipo);
    public abstract double getDanoItem();
    public abstract double getHpItem();
    public abstract double getStItem();
    public abstract String getNomeItem();
    public abstract void mostrarInventario();


}
