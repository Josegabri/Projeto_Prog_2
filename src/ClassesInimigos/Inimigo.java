package ClassesInimigos;

import ClassesJogador.Propriedades;

import java.util.ArrayList;
import java.util.List;

public abstract class Inimigo extends Propriedades{
    public static List<Inimigo> inimigos =  new ArrayList<>();

    public Inimigo(String nome) {
        super(nome);
    }
    public abstract double mostrarDropexp();
    public abstract void nivel(int fase);
    public abstract int getNivel();

    public void setInimigos(Inimigo inimigo){
        inimigos.add(inimigo);
    }

}
