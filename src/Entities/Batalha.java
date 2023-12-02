package Entities;

import java.util.Random;
import java.util.Scanner;

import ClassesInimigos.Aranha_Gigante;
import ClassesInimigos.Carcaju;
import ClassesInimigos.Carnical;
import ClassesInimigos.Caveira;
import ClassesInimigos.Cobra_Peconhenta;
import ClassesInimigos.Enxame_de_Aranhas;
import ClassesInimigos.Fungo;
import ClassesInimigos.Homunculo;
import ClassesInimigos.Inimigo;
import ClassesInimigos.Morcego;
import ClassesInimigos.Rastejante_Tenebroso;
import ClassesInimigos.Sanguessuga_Gigante;
import ClassesJogador.*;

public class Batalha {
    private static final String String = null;
    Scanner scanner = new Scanner(System.in);
    private String nome;
    private int opcao;
    private String ganhador;
    private int fase;
    private double totalSt;

    //private Item item;
    private Random aleatorio = new Random();

    public Batalha(String nome, int opcao) {
        this.nome = nome;
        this.opcao = opcao;
    }

    public Arqueiro escolha(Arqueiro arqueiro) {
        return new Arqueiro(this.nome);
    }

    public Guerreiro escolha(Guerreiro guerreiro) {
        return new Guerreiro(this.nome);
    }

    public Mago escolha(Mago mago) {
        return new Mago(this.nome);
    }


    public Jogador escolha(int opcao) {
        opcao = this.opcao;
        switch (this.opcao) {
            case 1:
                this.totalSt = 10.0;
                return new Mago(this.nome);
            case 2:
                this.totalSt = 10.0;
                return new Guerreiro(this.nome);
            case 3:
                this.totalSt = 10;
                return new Arqueiro(this.nome);
            default:
                return null;
        }
    }

    public Inimigo inimigo(int aleatorio) {
        switch (aleatorio) {
            case 0:
                return new Caveira("Caveira", this.fase);
            case 1:
                return new Fungo("Fungo", this.fase);
            case 2: 
                return new Aranha_Gigante("Aranha Gigante", this.fase);
            case 3: 
                return new Enxame_de_Aranhas("Enxame de Aranhas", this.fase);
            case 4: 
                return new Carcaju("Carcajú", this.fase);
            case 5 : 
                return new Carnical("Carniçal", this.fase);
            case 6 : 
                return new Rastejante_Tenebroso("Rastejante Tenebroso", this.fase);
            case 7 : 
                return new Sanguessuga_Gigante("Sanguessuga Gigante", this.fase);
            case 8 : 
                return new Morcego("Morcego", this.fase);
            case 9 : 
                return new Homunculo("Homúnculo", this.fase);
            case 10 : 
                return new Cobra_Peconhenta("Cobra Peçonhenta", this.fase);
            default:
                return null;
        }
    }
    // Adicionar um "inimigo_2" igual o inimigo a cima, em que só irá ter
    // inimigos de nível 2 nas escolhas, e assim por diante.

    public String batalha(int fase_sel) {
        this.fase = fase_sel;
        Jogador jogador = escolha(this.opcao);
        Inimigo inimigo = inimigo(this.aleatorio.nextInt(11));

        // código do desenvolvimento da batalha
        jogador = new ItemDecorator(this.nome, jogador);

        jogador = new ClasseHabilidade(this.nome, jogador);
        int rodada = 0;
        ganhador = null;
        System.out.println("\n" + inimigo.nome + " APARECEU!!\n");
        System.out.println("Dano do jogador: " + jogador.mostrarDano());
        System.out.println("Vida do jogador: " + jogador.mostrarHp());
        System.out.println("ST do jogador: " + jogador.mostrarSt());

        
        do {
        while ((ganhador != jogador.nome) && (ganhador != inimigo.nome)) {
            if (rodada == 0) {
                System.out.println("Escolha sua ação: ");
                System.out.println("1 - Ataque Básico");
                System.out.println("2 - Habilidade");
                System.out.println("3 - Itens Usáveis");
                System.out.println();
                int acao = scanner.nextInt();

                if (acao == 1) {
                    System.out.println(inimigo.nome + " recebeu "
                            + jogador.causarDano() + " de dano do " + jogador.nome);
                    inimigo.receberDano(jogador.causarDano());
                } else if (acao == 2) {
                    System.out.println("Esse é o ST total do jogador: " + this.totalSt + " E esse é o ST atual: " + jogador.mostrarSt());
                    jogador.mostrarHabilidades(this.opcao);
                    int escolha = scanner.nextInt();
                    if (jogador.mostrarSt() >= this.totalSt - this.totalSt * (20.0 / 100.0)) {
                        if (escolha == 1) {
                            System.out.println("Escolheu a habilidade: " + escolha);
                            System.out.println(inimigo.nome + " recebeu "
                             + jogador.habilidades(escolha) + " de dano do " + jogador.nome);
                            inimigo.receberDano(jogador.habilidades(escolha));
                            System.out.println("Você possui "+ jogador.mostrarSt() + " de st atualmente"  );

                        }else if (escolha == 2) {

                            if (jogador.mostrarSt() >= this.totalSt - this.totalSt * (40.0 / 100.0)) {
                                System.out.println(inimigo.nome + " recebeu "
                                 + jogador.habilidades(escolha) + " de dano do " + jogador.nome);
                                inimigo.receberDano(jogador.habilidades(escolha));
                                System.out.println("Você possui "+ jogador.mostrarSt() + " de ST atualmente"  );

                            }else {
                                System.out.println("Você não tem ST o suficiente para usar esta habilidade");
                                System.out.println("Você possui "+ jogador.mostrarSt() + " de ST atualmente"  );
                                continue;
                            }
                        } else if (escolha == 3) {
                            if (jogador.mostrarSt() >= this.totalSt - this.totalSt * (60.0 / 100.0)) {
                                System.out.println(inimigo.nome + " recebeu "
                                + jogador.habilidades(escolha) + " de dano do " + jogador.nome);
                                inimigo.receberDano(jogador.habilidades(escolha));
                                System.out.println("Você possui "+ jogador.mostrarSt() + " de ST atualmente"  );
                            }else {
                                System.out.println("Você não tem ST o suficiente para usar esta habilidade");
                                System.out.println("Você possui "+ jogador.mostrarSt() + " de ST atualmente"  );
                                continue;
                            }
                        }else if (escolha == 4) {
                            System.out.println("Esse é o ST total do jogador: " + this.totalSt + " E esse é o ST atual: " + jogador.mostrarSt());

                            if (jogador.mostrarSt() >= this.totalSt - this.totalSt * (80.0 / 100.0)) {
                                System.out.println(inimigo.nome + " recebeu "
                                        + jogador.habilidades(escolha) + " de dano do " + jogador.nome);
                                inimigo.receberDano(jogador.habilidades(escolha));
                                System.out.println("Você possui "+ jogador.mostrarSt() + " de ST atualmente"  );
                            } else {
                                System.out.println("Você não tem ST o suficiente para usar esta habilidade");
                                System.out.println("Você possui "+ jogador.mostrarSt() + " de ST atualmente"  );
                                continue;
                            }
                        }
                    }else {
                        System.out.println("Você não tem ST o suficiente para usar habilidades");
                        continue;
                    }
                }

                    System.out.println(inimigo.nome + " está com " + inimigo.mostrarHp() + " de vida.");
                    System.out.println(jogador.nome + " está com " + jogador.mostrarHp() + " de vida.");
                    rodada = 1;
                }

                else if (rodada == 1) {
                        System.out.println(jogador.nome + " recebeu "
                                + inimigo.causarDano() + " de dano do " + inimigo.nome);
                        jogador.receberDano(inimigo.causarDano());
                        System.out.println(jogador.nome + " está com " + jogador.mostrarHp() +
                                " de vida.");
                        System.out.println(inimigo.nome + " está com " + inimigo.mostrarHp() +
                                " de vida.");
                        rodada = 0;
                    }
                   if (jogador.mostrarHp() <= 0) { // inimigo vencedor
                        ganhador = inimigo.nome;
                        System.out.println("\nO vencedor da batalha foi " + inimigo.nome);
                    } else if (inimigo.mostrarHp() <= 0) { // jogador vencedor
                        ganhador = jogador.nome;
                        System.out.println("\nO vencedor da batalha foi " + jogador.nome);

                        jogador.aumentarNivel(inimigo.mostrarDropexp());
                        this.totalSt = jogador.mostrarSt();
                        jogador.dropItem(this.opcao);
                        jogador.equiparItem();
                    }
                } 
                } while ( jogador.mostrarHp() < 0);       
     return "\n VOCÊ PERDEU";
    }
}
