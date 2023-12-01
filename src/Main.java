import java.util.Scanner;

import ClassesInimigos.Inimigo;
import ClassesJogador.Jogador;
import ClassesJogador.Mago;
import Entities.Batalha;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Escolha sua classe: ");
        System.out.println("\n1 - Mago");
        System.out.println("2 - Guerreiro");
        System.out.println("3 - Arqueiro");
        int classe = scanner.nextInt();
        scanner.nextLine();
        Batalha batalha = new Batalha(nome, classe);
        
        // Organizar laço For, com mudança de nível até a morte do personagem
        // Com escolha da repetição do nível, ou prosseguir para o próximo.
        
       

        for (int i = 0 ; i< 10; i++){
            System.out.println("\n ROUND"+ (i+1));
            batalha.batalha(i);
        }
        scanner.close();
    }
}