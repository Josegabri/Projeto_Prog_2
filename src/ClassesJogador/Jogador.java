package ClassesJogador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Jogador extends Propriedades{

    public Jogador(String nome) {
        super(nome);
    }
    protected static List<String> inventarioNome =  new ArrayList<>();
    protected static List<Double> inventarioValor = new ArrayList<>();
    public abstract double mostrarSt();
    public abstract void aumentarDano(double item);
    public abstract void aumentarHp(double item);
    public abstract void aumentarSt(double item);
    public abstract void setSt(double stValue);
    double mostrarExp;
    public abstract void aumentarNivel(double experi);
    public abstract Integer mostrarNivel();
    public abstract void aumentarExp (double exper);
    public abstract double mostrarExp();
    public abstract void item(double dano, String nome, String tipo);
    public abstract double getDanoItem();
    public abstract double getHpItem();
    public abstract double getStItem();


    public abstract String getNomeItem();
    public abstract void setDanoItem(Double danoItem);
    public abstract void setStItem(Double stItem);
    public abstract void setHpItem(Double hpItem);
    public abstract void dropItem(int opcao);
    public abstract void aumentarStatus();
    public abstract void equiparItem();
    public abstract double habilidades(int escolha);
    public abstract void mostrarHabilidades(int opcao);


    public void mostrarInventario() {
        System.out.println("Você tem os seguintes itens no iventário: ");
        for (String item : inventarioNome) {
            System.out.println(inventarioNome.indexOf(item) + 1  + " ---> " + item);
        }
    }


}
