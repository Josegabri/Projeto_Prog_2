package ClassesJogador;

abstract class Propriedades {
    public String nome;

    public Propriedades(String nome) {
        this.nome = nome;
    }

    abstract double causarDano();
    abstract double receberDano(double dano);
    abstract double mostrarHp();
    abstract double mostrarDano();

}
