package ClassesJogador;

public class Jogador implements BaseJogador{
    private String nome;

    public Jogador(String nome) {
        this.nome = nome;
    }

    @Override
    public double dano() {
        return 0;
    }

    @Override
    public double hp() {
        return 0;
    }

    @Override
    public double st() {
        return 0;
    }


//    abstract double danoBasico();
//    abstract double habilidade();


}
