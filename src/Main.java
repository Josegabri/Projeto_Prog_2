import ClassesJogador.Batalha;
import ClassesJogador.Escolha;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Escolha uma classe: ");
        int opcao = scanner.nextInt();
        Escolha escolha = new Escolha();
        Batalha batalha = new Batalha(escolha);

    }
}
