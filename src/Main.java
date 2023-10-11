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
        scanner.nextLine();
        Batalha batalha = new Batalha(nome, classe);
        batalha.batalha();

    }
}