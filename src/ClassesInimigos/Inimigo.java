package ClassesInimigos;

abstract class Inimigo{

    private String nome;
    public Inimigo(String nome) {
        this.nome = nome;
    }



    abstract double dano();
    abstract double hp();
    abstract double st();


}
