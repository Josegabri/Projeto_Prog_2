package ClassesInimigos;

public class Zumbi extends Inimigo {

    public Zumbi(String nome) {
        super(nome);
    }

    @Override
    double dano() {
        return 0;
    }

    @Override
    double hp() {
        return 0;
    }

    @Override
    double st() {
        return 0;
    }
}
