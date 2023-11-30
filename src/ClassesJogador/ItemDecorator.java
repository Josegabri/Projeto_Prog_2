package ClassesJogador;

import ClassesJogador.Jogador;

import java.util.Random;


//Decorador Item para a classe jogador
public class ItemDecorator extends Jogador {

    private final Jogador jogador;
    public ItemDecorator(String nome, Jogador jogador) {
        super(nome);
        this.jogador = jogador;
    }

    @Override
    public void equiparItem() {
        jogador.equiparItem();
    }

    @Override
    public double mostrarSt() {
        return jogador.mostrarSt();
    }

    @Override
    public void aumentarDano(double item) {
        jogador.aumentarDano(item);
    }

    @Override
    public void aumentarHp(double item) {
        jogador.aumentarHp(item);
    }

    @Override
    public void aumentarSt(double item) {
        jogador.aumentarSt(item);
    }

    @Override
    public void setSt(double stValue) {
        jogador.setSt(stValue);
    }

    @Override
    public void aumentarNivel(double experi) {
        jogador.aumentarNivel(experi);
        
    }

    @Override
    public Integer mostrarNivel() {
        return jogador.mostrarNivel();
    }

    @Override
    public void aumentarExp(double exper) {
        jogador.aumentarExp(exper);
    }

    @Override
    public double mostrarExp() {
        return jogador.mostrarExp();
    }

    @Override
    public void item(double dano, String nome, String tipo) {
        jogador.item(dano, nome, tipo);
    }

    @Override
    public double getDanoItem() {
        return jogador.getDanoItem();
    }

    @Override
    public double getHpItem() {
        return jogador.getHpItem();
    }

    @Override
    public double getStItem() {
        return jogador.getStItem();
    }

    @Override
    public String getNomeItem() {
        return jogador.getNomeItem();
    }

    @Override
    public void setDanoItem(Double danoItem) {
        jogador.setDanoItem(danoItem);
    }

    @Override
    public void setStItem(Double stItem) {
        jogador.setStItem(stItem);
    }

    @Override
    public void setHpItem(Double hpItem) {
        jogador.setHpItem(hpItem);
    }

    @Override
    public void mostrarInventario() {
        jogador.mostrarInventario();
    }

    @Override
    public double causarDano() {
        return jogador.causarDano();
    }

    @Override
    public double receberDano(double dano) {
        return jogador.receberDano(dano);
    }

    @Override
    public double mostrarHp() {
        return jogador.mostrarHp();
    }

    @Override
    public double mostrarDano() {
        return jogador.mostrarDano();
    }

    @Override
    public void aumentarStatus() {
        jogador.aumentarStatus();
    }

    @Override
    public double habilidades(int escolha) {
        if (escolha == 1) {
            jogador.setSt(jogador.mostrarSt() - (jogador.mostrarSt()* (20.0 / 100.0)));
            System.out.println("Habilidade escolhida: " + this.causarDano());
            return this.causarDano() + (this.causarDano()*(10.0 / 100.0));

        } else if (escolha == 2) {
            jogador.setSt(jogador.mostrarSt() - (jogador.mostrarSt()* (40.0 / 100.0)));
            return this.causarDano() + (this.causarDano() * (40.0 / 100.0));
        } else if (escolha == 3) {
            jogador.setSt(jogador.mostrarSt() - (jogador.mostrarSt()* (60.0 / 100.0)));
            return this.causarDano() + (this.causarDano() * (60.0 / 100.0));
        } else {
            jogador.setSt(jogador.mostrarSt() - (jogador.mostrarSt()* (80.0 / 100.0)));
            return this.causarDano() + (this.causarDano() * (80.0 / 100.0));
        }
    }


    //Dropa um item de acordo com a classe
    public void dropItem(int opcao) {
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

    }


    //Algoritmo de chance de drop de item
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
