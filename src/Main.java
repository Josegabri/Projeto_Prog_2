
import ClassesJogador.Batalha;

import java.util.Scanner;

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
        batalha.batalha();

        scanner.close();
    }
}