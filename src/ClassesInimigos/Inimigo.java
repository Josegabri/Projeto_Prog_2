package ClassesInimigos;

import ClassesJogador.Propriedades;

public abstract class Inimigo extends Propriedades{

    public Inimigo(String nome) {
        super(nome);
    }

    public abstract double mostrarDropexp();

}
