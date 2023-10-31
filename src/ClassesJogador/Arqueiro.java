package ClassesJogador;

import java.util.Random;

public class Arqueiro extends Jogador{

    protected double dano = 12;
    protected double hp = 20;
    protected double st = 10;
    protected Integer nivel = 1;
    protected double exp;
    protected double min_exp = nivel* 10;
    protected double item = 0;
    protected String nomeItem = "";

    public Arqueiro(String nome) {
        super(nome);
    }

    @Override
    public  double causarDano() {
        return this.dano;
    }

    @Override // alterar
    double usarSt() {
        return 0;
    }

    @Override
    double mostrarSt() {
        return this.st;
    }

    @Override
    public void aumentarDano(double item) {
    }

    @Override
    void aumentarHp(double item) {
    }

    @Override
    public double receberDano(double dano) {
        this.hp -= dano;
        return this.hp;
    }

    @Override
    public double mostrarHp() {
        return this.hp;
    }

    @Override
    public double mostrarDano() {
        return this.dano;
    }

    @Override
    public String aumentarNivel(double experi) {
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
    Integer mostrarNivel() {
        return this.nivel;
    }

    @Override
    
    public void aumentarExp(double exper) {
        exp += exper;
    }

    @Override
    public double mostrarExp() {
        return this.exp;
    }
    @Override
    public void item(){
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(100);
        if (valor <= 49){
            this.item = 5;
            this.nomeItem = "Arco Comum";
        } else if (valor <= 84){
            this.item = 10;
            this.nomeItem = "Arco Raro";
        } else if (valor <= 99){
            this.item = 15;
            this.nomeItem = "Arco Lendária";
        }
        this.dano += this.item;

    }

    @Override
    public String nomeItem() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nomeItem'");
    }
}
