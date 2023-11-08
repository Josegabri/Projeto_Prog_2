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
    private int fase = 1;

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
                return new Caveira("Caveira", this.fase);
            case 1:
                return new Fungo("Fungo", this.fase);
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
        Jogador Jogador = (Jogador) classe;
        Inimigo inimigo2 = (Inimigo) inimigo;
       
        // código do desenvolvimento da batalha 
        int rodada = 0;
        ganhador =null;
        System.out.println("\n"+inimigo2.nome + " APARECEU!!\n");

        while ( (ganhador != Jogador.nome) && (ganhador != inimigo2.nome)){
            
            if (rodada == 0){
                System.out.println( inimigo2.nome+ " recebeu "
                +Jogador.mostrarDano()+ " de dano do "+ 
                Jogador.nome);
                inimigo2.receberDano(Jogador.causarDano());
                System.out.println(inimigo2.nome + " está com "+inimigo2.mostrarHp()+ 
                " de vida.");
                System.out.println(Jogador.nome + " está com " + Jogador.mostrarHp()+
                " de vida.");
                rodada = 1;    
            }
            
            else if ( rodada == 1 ){
                System.out.println(Jogador.nome+ " recebeu "
                +inimigo2.mostrarDano()+" de dano do "+ inimigo2.nome);
                Jogador.receberDano(inimigo2.causarDano());
                System.out.println(Jogador.nome + " está com " + Jogador.mostrarHp()+
                " de vida.");
                System.out.println(inimigo2.nome + " está com "+inimigo2.mostrarHp()+ 
                " de vida.");
                rodada = 0;
            }

            // Define ganhador. 
            if ( Jogador.mostrarHp() <= 0 ){ // inimigo vencedor 
                ganhador = inimigo2.nome;
                System.out.println("\nO vencedor da batalha foi "+inimigo2.nome);
            }
            else if ( inimigo2.mostrarHp() <= 0 ){ // Jogador vencedor 
                ganhador = Jogador.nome;
                System.out.println("\nO vencedor da batalha foi "+Jogador.nome);
                
                Jogador.aumentarExp(inimigo2.mostrarDropexp());
                System.out.println(Jogador.aumentarNivel(Jogador.mostrarExp()));  

                System.out.println("\nDano antes do item: " + Jogador.mostrarDano());
                Jogador.equiparItem().classeItem(this.opcao);
                Jogador.aumentarDano(Jogador.getDanoItem());
                System.out.println("Você ganhou o item " + Jogador.getNomeItem() + " de dano " + Jogador.getDanoItem());



                System.out.println("Dano após a equipagem do item: " + Jogador.mostrarDano());
                Jogador.mostrarInventario();

            }
        }        
    }
    
    public String getGanhador() {
        return ganhador;
    }
    
}
