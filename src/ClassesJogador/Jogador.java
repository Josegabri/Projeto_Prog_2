package ClassesJogador;

abstract class Jogador {
    protected String nome;

    public Jogador(String nome) {
        this.nome = nome;
    }

    abstract double dano();
    abstract double hp();
    abstract double st();
}
