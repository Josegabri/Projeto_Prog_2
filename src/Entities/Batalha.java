package Entities;

import java.util.Random;

import ClassesInimigos.Caveira;
import ClassesInimigos.Fungo;
import ClassesInimigos.Inimigo;
import ClassesJogador.Arqueiro;
import ClassesJogador.Guerreiro;
import ClassesJogador.Item;
import ClassesJogador.Jogador;
import ClassesJogador.Mago;

public class Batalha{
    private String nome;
    private int opcao;
    private String ganhador;

    //private Item item;
    private Random aleatorio;

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

    public Object inimigo(int aleatorio){
        switch (aleatorio){
            case 0:
                return new Caveira("Caveira");
            case 1:
                return new Fungo("Fungo");
            default:
                return null;
        }
    }
    // Adicionar um "inimigo_2" igual o inimigo a cima, em que só irá ter 
    // inimigos de nível 2 nas escolhas, e assim por diante. 

    public void batalha(){
        this.aleatorio = new Random();
        Object classe = escolha(this.opcao);
        Object inimigo = inimigo(this.aleatorio.nextInt(2));
        Jogador jogador = (Jogador) classe;
        Inimigo inimigo2 = (Inimigo) inimigo;
       
        // código do desenvolvimento da batalha 
        int rodada = 0;
        ganhador =null;
        System.out.println("\n"+inimigo2.nome + " APARECEU!!\n");

        while ( (ganhador != jogador.nome) && (ganhador != inimigo2.nome)){
            
            if (rodada == 0){
                System.out.println( inimigo2.nome+ " recebeu "
                +jogador.mostrarDano()+ " de dano do "+ 
                jogador.nome);
                inimigo2.receberDano(jogador.causarDano());
                System.out.println(inimigo2.nome + " está com "+inimigo2.mostrarHp()+ 
                " de vida.");
                System.out.println(jogador.nome + " está com " + jogador.mostrarHp()+
                " de vida.");
                rodada = 1;    
            }
            
            else if ( rodada == 1 ){
                System.out.println(jogador.nome+ " recebeu "
                +inimigo2.mostrarDano()+" de dano do "+ inimigo2.nome);
                jogador.receberDano(inimigo2.causarDano());
                System.out.println(jogador.nome + " está com " + jogador.mostrarHp()+
                " de vida.");
                System.out.println(inimigo2.nome + " está com "+inimigo2.mostrarHp()+ 
                " de vida.");
                rodada = 0;
            }

            // Define ganhador. 
            if ( jogador.mostrarHp() <= 0 ){ // inimigo vencedor 
                ganhador = inimigo2.nome;
                System.out.println("\nO vencedor da batalha foi "+inimigo2.nome);
            }
            else if ( inimigo2.mostrarHp() <= 0 ){ // jogador vencedor 
                ganhador = jogador.nome;
                System.out.println("\nO vencedor da batalha foi "+jogador.nome);
                
                jogador.aumentarExp(inimigo2.mostrarDropexp());
                System.out.println(jogador.aumentarNivel(jogador.mostrarExp()));  

                System.out.println("\nDano antes do item: " + jogador.mostrarDano());
                    jogador.equiparItem().classeItem(this.opcao);
                    jogador.aumentarDano(jogador.danoItem());
                System.out.println("Você ganhou o item " + jogador.nomeItem() + " de dano " + jogador.danoItem());
                System.out.println("Dano após a equipagem do item: " + jogador.mostrarDano());
            }
        }        
    }
    
    public String getGanhador() {
        return ganhador;
    }
    
}
