package ClassesJogador;

public abstract class Jogador extends Propriedades{

    public Jogador(String nome) {
        super(nome);
    }

    public abstract void equiparItem();
    public abstract double usarSt();
    public abstract double mostrarSt();
    public abstract void aumentarDano(double item);
    public abstract void aumentarHp(double item);
    public abstract void aumentarSt(double item);
    double mostrarExp;
    public abstract String aumentarNivel(double experi);
    public abstract Integer mostrarNivel();
    public abstract void aumentarExp (double exper);
    public abstract double mostrarExp();
    public abstract void item(double dano, String nome, String tipo);
    public abstract double getDanoItem();
    public abstract double getHpItem();
    public abstract double getStItem();
    public abstract String getNomeItem();
    public abstract void mostrarInventario();


}
