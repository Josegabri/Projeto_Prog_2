package ClassesJogador;

import java.util.ArrayList;
import java.util.List;

public class Guerreiro extends Jogador{

    protected static double dano = 10;
    protected static double hp = 25;
    protected static double st = 10;
    protected static Integer nivel = 1;
    protected static double exp = 0;
    protected static double min_exp = nivel* 8;
    protected double danoItem;
    protected double hpItem;
    protected double stItem;
    protected String nomeItem;
    protected Item item;
    protected static List<String> inventario =  new ArrayList<>();


    public Guerreiro(String nome) {
        super(nome);
        this.item = new Item(this);

    }

    @Override
    public double causarDano() {
        return this.dano;
    }

    @Override // ainda para ser alterado
    double usarSt() {
        this.st -= 7 ;
        return this.dano+4;
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
    double mostrarSt() {
        return this.st;
    }

    @Override
    public void aumentarDano(double item) {
        this.dano += item;
    }

    @Override
    void aumentarHp(double item) {
    }

    @Override
    void aumentarSt(double item) {

    }

    @Override
    public String aumentarNivel(double experi) {
        exp += experi;
        System.out.println("Minimo necessário para passar de nivel: " + min_exp);
        System.out.println("Você ganhou " + experi + " de Experiência!!!!!!!!!!!");
        if (exp > min_exp){
            System.out.println("!!!!!!!! Você passou de nivel !!!!!!!");
            exp -= min_exp;
            nivel +=1;
            min_exp = nivel*8;
            System.out.println("Você está no nivel " + nivel);
            System.out.println("Você possui " + exp +" no nivel " + nivel);
            System.out.println("Você precisa de " + min_exp + " Para ir ao próximo nivel!!!!!!!!!!!");

        } else {
            System.out.println("Você precisa de " + (min_exp - exp) + " para passar de nivel");
        }
        return "";
    }

    @Override
    Integer mostrarNivel() {
        return this.nivel;    
    }

    @Override
    
    public void aumentarExp(double exper) {
    }

    @Override
    public double mostrarExp() {
        return this.exp;
    }

    @Override
    public Item equiparItem() {
        return this.item;
    }

    @Override
    public void item(double dano, String nome, String tipo) {
        if (tipo == "dano") {
            this.danoItem = dano;
            this.nomeItem = nome;
        } else if (tipo == "hp"){
            this.hpItem = dano;
            this.nomeItem = nome;
        } else {
            this.stItem = dano;
            this.nomeItem = nome;
        }
        this.inventario.add(this.nomeItem);
    }

    @Override
    public double getDanoItem() {
        return this.danoItem;
    }

    @Override
    public double getHpItem() {
        return this.hpItem;
    }

    @Override
    public double getStItem() {
        return this.stItem;
    }

    @Override
    public String getNomeItem() {
        return this.nomeItem;
    }

    @Override
    public void mostrarInventario() {
        System.out.print("Você tem os seguintes itens no iventário: ");
        for (int i = 0; i < this.inventario.size(); i++){
            System.out.print(" " + this.inventario.get(i) + " ");
        }
    }

}

