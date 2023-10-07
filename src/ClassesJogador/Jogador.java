package ClassesJogador;

abstract class Jogador {
    private String nome;
    public Jogador(String nome) {
        this.nome = nome;
    }


    abstract double dano();
    abstract double hp();
    abstract double st();
//    abstract double danoBasico();
//    abstract double habilidade();


}
