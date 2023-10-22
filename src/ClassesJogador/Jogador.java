package ClassesJogador;

abstract class Jogador extends Propriedades{

    public Jogador(String nome) {
        super(nome);
    }
    abstract double usarSt();
    abstract double mostrarSt();
}
