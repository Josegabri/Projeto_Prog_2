package ClassesJogador;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Arqueiro extends Jogador{

    protected double dano = 12;
    protected double hp = 20;
    protected double st = 10;
    protected Integer nivel = 1;
    protected double exp;
    protected double min_exp = nivel* 10;
//    protected double item = 0;
    protected String nomeItem;
    protected double danoItem;
    protected double hpItem;
    protected double stItem;
    protected Item item;
    protected List<String> inventario =  new ArrayList<>();

    public Arqueiro(String nome) {
        super(nome);
        this.item = new Item(this);
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
        this.dano += item;
    }

    @Override
    void aumentarHp(double item) {
    }

    @Override
    void aumentarSt(double item) {

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
