package ClassesJogador;

import ClassesJogador.Arqueiro;
import ClassesJogador.Guerreiro;
import ClassesJogador.Mago;

import java.util.Scanner;

public class Batalha{
    private String nome;
    private int opcao;

    public Batalha(String nome, int opcao) {
        this.nome = nome;
        this.opcao = opcao;
    }

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
        Object classe = this.escolha(new Mago(this.nome));
        switch (this.opcao){
            case 1:
                classe = this.escolha(new Arqueiro(nome));
                break;
            case 2:
                classe = this.escolha(new Guerreiro(nome));
                break;
            case 3:
                classe = this.escolha(new Mago(nome));
                break;
        }
        ((Jogador) classe).dano();

    }

}



























//    private Arqueiro arqueiro = new Arqueiro(this.nome);
//    private Guerreiro guerreiro = new Guerreiro(this.nome);
//    private Mago mago = new Mago(this.nome);
