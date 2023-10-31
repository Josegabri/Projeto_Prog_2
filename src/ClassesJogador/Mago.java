package ClassesJogador;

public class Mago extends Jogador{
    protected double dano = 15;
    protected double hp = 15;
    protected double st = 10;
    protected Integer nivel = 1;
    protected double exp= 0;
    protected double min_exp = nivel* 15;
    
    public Mago(String nome) {
        super(nome);
    }

    @Override
     public double causarDano() {
        return this.dano;
    }

    @Override
    double usarSt() {
        this.st -= 4;
        return this.dano + 4;
    }

    @Override
    public double receberDano(double dano) {
        this.hp -= dano;
        return this.hp;
    }

    @Override
    public
    double mostrarHp() {
        return this.hp;
    }

    @Override
    public
    double mostrarDano() {
        return this.dano;
    }

    @Override
    double mostrarSt() {
        return this.st;
    }

    @Override
    public
    void aumentarDano(double item) {
        dano = item;
    }

    @Override
    void aumentarHp(double item) {
    }

    @Override 
    public String aumentarNivel(double experi){ //mostrarExp() como parâmentro
         if (experi > min_exp){ 
            nivel+=1;
            return "Ganhou " + experi+ " de experiência "
            +"\nVocê aumentou de nível!!" + "\n" + 
            "Está no nível " + nivel+ ".";
         }
         else {
            return "Ganhou " + experi+ " de experiência "
            +"\nVocê precisa de "+ (min_exp - experi) + 
            " para avançar de nível.";
         }
    }

    @Override 
    Integer mostrarNivel(){
        return this.nivel;
    }

    @Override
    public 
    void aumentarExp(double exper){
        exp += exper;
    }

    @Override
    public double mostrarExp(){
        return this.exp;
    }
    

}
