package ClassesJogador;

public class Mago extends Jogador{
    public Mago(String nome) {
        super(nome);
    }

    @Override
     double dano() {
        return 10;
    }

    @Override
    double hp() {
        return 10;
    }

    @Override
    double st() {
        return 10;
    }


}
