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

    public Object escolha(int opcao){
        opcao = this.opcao;
        switch (this.opcao){
            case 1:
                return new Mago(this.nome);
            case 2:
                return new Guerreiro(this.nome);
            case 3:
                return new Arqueiro(this.nome);
            default:
                return null;
        }
    }

    public void batalha(){
        Object classe = escolha(this.opcao);
        Object inimigo = new Cachorro("cachorro");
        Jogador classe_convert = (Jogador) classe;
        Inimigo inimigo2 = (Inimigo) inimigo;
        System.out.println(inimigo2.causarDano());
        System.out.println(classe_convert.mostrarHp());
        classe_convert.receberDano(inimigo2.causarDano());
        System.out.println(classe_convert.mostrarHp());
    }

}



























//    private Arqueiro arqueiro = new Arqueiro(this.nome);
//    private Guerreiro guerreiro = new Guerreiro(this.nome);
//    private Mago mago = new Mago(this.nome);
