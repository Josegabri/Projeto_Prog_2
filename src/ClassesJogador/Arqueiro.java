package ClassesJogador;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Arqueiro extends Jogador{

    protected static double dano = 12;
    protected static double hp = 20;
    protected static double st = 10;
    protected static Integer nivel = 1;
    protected static double exp;
    protected static double min_exp = nivel* 10;
    protected String nomeItem;
    protected static double danoItem = 0;
    protected double hpItem = 0;
    protected double stItem = 0;


    public Arqueiro(String nome) {
        super(nome);
    }


    @Override
    public  double causarDano() {
        return dano + this.danoItem;
    }


    @Override
    public double mostrarSt() {
        return st;
    }

    @Override
    public void aumentarDano(double item) {
        dano += item;
    }

    @Override
    public void aumentarHp(double item) {
    }

    @Override
    public void aumentarSt(double item) {

    }

    @Override
    public void setSt(double stValeu) {
        st = stValeu;
    }

    @Override
    public double receberDano(double dano) {
        hp -= dano;
        return hp;
    }

    @Override
    public double mostrarHp() {
        return hp;
    }

    @Override
    public double mostrarDano() {
        return dano;
    }

    @Override
    public void aumentarNivel(double experi) {
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
            System.out.println("Seus Status aumentaram!!!!");
            System.out.println("Dano aumentado em: " + dano*(10.0/100.0));
            System.out.println("Dano aumentado em: " + hp*(10.0/100.0));
            System.out.println("Dano aumentado em: " + st*(10.0/100.0));
            this.aumentarStatus();

        } else {
            System.out.println("Você precisa de " + (min_exp - exp) + " para passar de nivel");
        }
        
    }

    @Override
    public Integer mostrarNivel() {
        return nivel;
    }

    @Override

    public void aumentarExp(double exper) {
    }

    @Override
    public double mostrarExp() {
        return exp;
    }


    @Override
    public void item(double dano, String nome, String tipo) {
        inventarioNome.add(nome);
        inventarioValor.add(dano);
    }

    @Override
    public double getDanoItem() {
        return this.danoItem;
    }
    @Override
    public void setDanoItem(Double dano) {
        this.danoItem = dano;
    }

    @Override
    public void setHpItem(Double hpItem) {
        hp-= this.hpItem;
        this.hpItem = hpItem;
        hp+= this.hpItem;
    }

    @Override
    public void setStItem(Double stItem) {
        st-= this.stItem;
        this.stItem = stItem;
        st+= this.stItem;
    }

    @Override
    public void dropItem(int opcao) {

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
    public void aumentarStatus() {
        dano += dano*(10.0/100.0);
        hp += hp*(10.0/100.0);
        st += st*(10.0/100.0);
    }

    @Override
    public double habilidades(int escolha) {
        return 0;
    }


}
