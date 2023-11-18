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
        int rodada = 0;
        ganhador =null;
        System.out.println("\n"+inimigo.nome + " APARECEU!!\n");

        while ( (ganhador != jogador.nome) && (ganhador != inimigo.nome)){
            ItemDecorator jogadorEquipado = new ItemDecorator(this.nome, jogador);
            if (rodada == 0){ 
                System.out.println("Escolha sua ação: ");
                System.out.println("1 - Ataque Básico");
                System.out.println("2 - Habilidade");
                System.out.println("3 - Itens Usáveis");
                System.out.println();
                int acao = scanner.nextInt();

                if (acao == 1 ){
                System.out.println( inimigo.nome+ " recebeu "
                +jogadorEquipado.mostrarDano()+ " de dano do "+ jogadorEquipado.nome);
                inimigo.receberDano(jogadorEquipado.causarDano());
                }

                System.out.println(inimigo.nome + " está com "+inimigo.mostrarHp()+
                " de vida.");
                System.out.println(jogadorEquipado.nome + " está com " + jogadorEquipado.mostrarHp()+
                " de vida.");
                rodada = 1;
            }

            else if ( rodada == 1 ){
                System.out.println(jogadorEquipado.nome+ " recebeu "
                +inimigo.mostrarDano()+" de dano do "+ inimigo.nome);
                jogadorEquipado.receberDano(inimigo.causarDano());
                System.out.println(jogadorEquipado.nome + " está com " + jogadorEquipado.mostrarHp()+
                " de vida.");
                System.out.println(inimigo.nome + " está com "+inimigo.mostrarHp()+
                " de vida.");
                rodada = 0;
            }

            // Define ganhador.
            if ( jogadorEquipado.mostrarHp() <= 0 ){ // inimigo vencedor
                ganhador = inimigo.nome;
                System.out.println("\nO vencedor da batalha foi "+inimigo.nome);
            }
            else if ( inimigo.mostrarHp() <= 0 ){ // jogadorEquipado vencedor
                ganhador = jogadorEquipado.nome;
                System.out.println("\nO vencedor da batalha foi "+jogadorEquipado.nome);

                System.out.println(jogadorEquipado.aumentarNivel(inimigo.mostrarDropexp()));

                jogadorEquipado.classeItem(this.opcao);
                System.out.println("Você ganhou o item " + jogadorEquipado.getNomeItem() + " de dano " + jogadorEquipado.getDanoItem());

                System.out.println("\nDano antes do item: " + jogadorEquipado.mostrarDano());

                jogadorEquipado.aumentarDano(jogadorEquipado.getDanoItem());
                System.out.println("Dano após a equipagem do item: " + jogadorEquipado.mostrarDano());
                jogadorEquipado.mostrarInventario();

            }
        }        
    }
    
    public String getGanhador() {
        return ganhador;
    }
}
