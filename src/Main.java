import ClassesJogador.Arqueiro;
import ClassesJogador.Batalha;
import ClassesJogador.Guerreiro;
import ClassesJogador.Mago;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escolha sua classe: ");
        int classe = scanner.nextInt();
        System.out.print("Escolha seu nome: ");
        String nome = scanner.nextLine();
        Batalha batalha = new Batalha();
        switch (classe){
            case 1:
                batalha.escolha(new Arqueiro(nome));
            case 2:
                batalha.escolha(new Guerreiro(nome));
            case 3:
                batalha.escolha(new Mago(nome));
        }

    }
}