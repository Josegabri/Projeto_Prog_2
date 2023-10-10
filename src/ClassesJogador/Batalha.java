package ClassesJogador;

import ClassesJogador.Arqueiro;
import ClassesJogador.Guerreiro;
import ClassesJogador.Mago;

import java.util.Scanner;

public class Batalha{
    private String nome;
    private int opcao;


    public Arqueiro escolha(Arqueiro arqueiro){
        return new Arqueiro(this.nome);
    }
    public Guerreiro escolha(Guerreiro guerreiro){
        return new Guerreiro(this.nome);
    }
    public Mago escolha(Mago mago){
        return new Mago(this.nome);
    }

    public void batalha(){

    }

}



























//    private Arqueiro arqueiro = new Arqueiro(this.nome);
//    private Guerreiro guerreiro = new Guerreiro(this.nome);
//    private Mago mago = new Mago(this.nome);
