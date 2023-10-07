package ClassesInimigos;

public class Esqueleto extends Inimigo{

    public Esqueleto(String nome) {
        super(nome);
    }

    @Override
    double dano() {
        return 3;
    }

    @Override
    double hp() {
        return 7;
    }

    @Override
    double st() {
        return 5;
    }
}
