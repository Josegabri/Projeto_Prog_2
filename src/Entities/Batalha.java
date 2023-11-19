package Entities;

import java.util.Random;
import java.util.Scanner;

import ClassesInimigos.Caveira;
import ClassesInimigos.Fungo;
import ClassesInimigos.Inimigo;
import ClassesJogador.Arqueiro;
import ClassesJogador.Guerreiro;
import ClassesJogador.Jogador;
import ClassesJogador.Mago;
import ClassesJogador.ItemDecorator;

public class Batalha{
    Scanner scanner = new Scanner(System.in);
    private String nome;
    private int opcao;
    private String ganhador;
    private int fase;

    //private Item item;
    private Random aleatorio = new Random();

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


    public Jogador escolha(int opcao){
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

    public Inimigo inimigo(int aleatorio){
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

    public void batalha(int fase_sel){
        this.fase = fase_sel;
        Jogador jogador = escolha(this.opcao);
        Inimigo inimigo = inimigo(this.aleatorio.nextInt(2));

        // código do desenvolvimento da batalha
        jogador = new ItemDecorator(this.nome, jogador);

        int rodada = 0;
        ganhador =null;
        System.out.println("\n"+inimigo.nome + " APARECEU!!\n");

        while ( (ganhador != jogador.nome) && (ganhador != inimigo.nome)){
            if (rodada == 0){ 
                System.out.println("Escolha sua ação: ");
                System.out.println("1 - Ataque Básico");
                System.out.println("2 - Habilidade");
                System.out.println("3 - Itens Usáveis");
                System.out.println();
                int acao = scanner.nextInt();

                if (acao == 1 ){
                System.out.println( inimigo.nome+ " recebeu "
                +jogador.causarDano()+ " de dano do "+ jogador.nome);
                inimigo.receberDano(jogador.causarDano());
                }

                System.out.println(inimigo.nome + " está com "+inimigo.mostrarHp()+
                " de vida.");
                System.out.println(jogador.nome + " está com " + jogador.mostrarHp()+
                " de vida.");
                rodada = 1;
            }

            else if ( rodada == 1 ){
                System.out.println(jogador.nome+ " recebeu "
                +inimigo.causarDano()+" de dano do "+ inimigo.nome);
                jogador.receberDano(inimigo.causarDano());
                System.out.println(jogador.nome + " está com " + jogador.mostrarHp()+
                " de vida.");
                System.out.println(inimigo.nome + " está com "+inimigo.mostrarHp()+
                " de vida.");
                rodada = 0;
            }

            // Define ganhador.
            if ( jogador.mostrarHp() <= 0 ){ // inimigo vencedor
                ganhador = inimigo.nome;
                System.out.println("\nO vencedor da batalha foi "+inimigo.nome);
            }
            else if ( inimigo.mostrarHp() <= 0 ){ // jogador vencedor
                ganhador = jogador.nome;
                System.out.println("\nO vencedor da batalha foi "+jogador.nome);

                System.out.println(jogador.aumentarNivel(inimigo.mostrarDropexp()));

                jogador.dropItem(this.opcao);
                jogador.equiparItem();


            }
        }        
    }
    
    public String getGanhador() {
        return ganhador;
    }
}
