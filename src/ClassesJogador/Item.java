package ClassesJogador;

import java.util.Random;

//Adicionando itens
public class Item {


    private Jogador jogador;

    public Item(Jogador jogador) {
        this.jogador = jogador;
    }

    public void classeItem(int opcao) {
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(150);
        if(opcao == 1){
            if (valor <= 49){
                itemMago();
            } else if (valor <= 99){
                itemHp();
            } else {
                itemSt();
            }
        } else if(opcao == 2){
            if (valor <= 99){
                itemGuerreiro();
            } else if (valor <= 99){
                itemHp();
            } else {
                itemSt();
            }
        } else {
            if (valor <= 49){
                itemArqueiro();
            } else if (valor <= 99){
                itemHp();
            } else {
                itemSt();
            }
        }
//        switch (opcao){
//            case 1:
//                itemMago();
//                break;
//            case 2:
//                itemGuerreiro();
//                break;
//            case 3:
//                itemArqueiro();
//                break;
//       }
    }



    public void itemMago() {
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(150);
        if (valor <= 49) {
            this.jogador.item(5, "Cajado comum", "dano");
        } else if (valor <= 84) {
            this.jogador.item(10, "Cajado raro", "dano");
        } else if (valor <= 99) {
            this.jogador.item(15, "Cajado lendário", "dano");
        } else {
            System.out.println("Nenhum item dropado");
        }
    }
    public void itemGuerreiro() {
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(150);
        if (valor <= 49) {
            this.jogador.item(5, "Espada comum", "dano");
        } else if (valor <= 84) {
            this.jogador.item(10, "Espada rara", "dano");
        } else if (valor <= 99) {
            this.jogador.item(15, "Espada lendária", "dano");
        } else {
            System.out.println("Nenhum item dropado");
        }

    }
    public void itemArqueiro() {
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(150);
        if (valor <= 49) {
            this.jogador.item(5, "Arco comum", "dano");
        } else if (valor <= 84) {
            this.jogador.item(10, "Arco raro", "dano");
        } else if (valor <= 99) {
            this.jogador.item(15, "Arco lendário", "dano");
        } else {
            System.out.println("Nenhum item dropado");
        }
    }

    public void itemHp(){
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(150);
        if (valor <= 49) {
            this.jogador.item(5, "Armadura comum", "hp");
        } else if (valor <= 84) {
            this.jogador.item(10, "Armadura rara", "hp");
        } else if (valor <= 99) {
            this.jogador.item(15, "Armadura lendária", "hp");
        } else {
            System.out.println("Nenhum item dropado");
        }
    }

    public void itemSt(){
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(150);
        if (valor <= 49) {
            this.jogador.item(5, "Colar comum", "st");
        } else if (valor <= 84) {
            this.jogador.item(10, "Colar raro", "st");
        } else if (valor <= 99) {
            this.jogador.item(15, "Colar lendário", "st");
        } else {
            System.out.println("Nenhum item dropado");
        }
    }

}






































//    private int nivel;
//    //private int item;
//
//    public Item(int nivel) {
//        this.nivel = nivel;
//    }
//
//    protected int espada(){
//        System.out.println("Você pegou a espada");
//        int base = 10;
//        return base*this.nivel;
//    }
//    public int cajado(){
//        System.out.println("Você pegou o cajado");
//        int base = 10;
//        return base*this.nivel;
//    }
//
//
//    protected int arco(){
//        System.out.println("Você pegou o arco");
//        int base = 10;
//        return base*this.nivel;
//    }