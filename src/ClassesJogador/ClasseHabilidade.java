package ClassesJogador;

import java.util.Random;

public class ClasseHabilidade extends ItemDecorator {
    public static double stTotal;

    public ClasseHabilidade(String nome, Jogador jogador) {
        super(nome, jogador);
    }


    public void equiparItem() {
        super.equiparItem();
    }

    @Override
    public double mostrarSt() {
        return super.mostrarSt();
    }

    @Override
    public void aumentarDano(double item) {
        super.aumentarDano(item);
    }

    @Override
    public void aumentarHp(double item) {
        super.aumentarHp(item);
    }

    @Override
    public void aumentarSt(double item) {
        super.aumentarSt(item);
    }

    @Override
    public void setSt(double stValue) {
        super.setSt(stValue);
    }

    @Override
    public void aumentarNivel(double experi) {
        super.aumentarNivel(experi);

    }

    @Override
    public Integer mostrarNivel() {
        return super.mostrarNivel();
    }

    @Override
    public void aumentarExp(double exper) {
        super.aumentarExp(exper);
    }

    @Override
    public double mostrarExp() {
        return super.mostrarExp();
    }

    @Override
    public void item(double dano, String nome, String tipo) {
        super.item(dano, nome, tipo);
    }

    @Override
    public double getDanoItem() {
        return super.getDanoItem();
    }

    @Override
    public double getHpItem() {
        return super.getHpItem();
    }

    @Override
    public double getStItem() {
        return super.getStItem();
    }

    @Override
    public String getNomeItem() {
        return super.getNomeItem();
    }

    @Override
    public void setDanoItem(Double danoItem) {
        super.setDanoItem(danoItem);
    }

    @Override
    public void setStItem(Double stItem) {
        super.setStItem(stItem);
    }

    @Override
    public void setHpItem(Double hpItem) {
        super.setHpItem(hpItem);
    }

    @Override
    public double causarDano() {
        return super.causarDano();
    }

    @Override
    public double receberDano(double dano) {
        return super.receberDano(dano);
    }

    @Override
    public double mostrarHp() {
        return super.mostrarHp();
    }

    @Override
    public double mostrarDano() {
        return super.mostrarDano();
    }

    @Override
    public void aumentarStatus() {
        super.aumentarStatus();
    }


    //Dropa um item de acordo com a classe
    @Override
    public void dropItem(int opcao) {
        super.dropItem(opcao);
    }


    //Algoritmo de chance de drop de item
    @Override
    public void itemMago() {
        super.itemMago();
    }

    @Override
    public void itemGuerreiro() {
        super.itemGuerreiro();

    }

    @Override
    public void itemArqueiro() {
        super.itemArqueiro();
    }

    @Override
    public void itemHp() {
        super.itemHp();
    }


    @Override
    public void itemSt() {
        super.itemSt();
    }

    @Override
    public void mostrarInventario() {
        super.mostrarInventario();
    }

    @Override
    public void mostrarHabilidades(int opcao) {
        switch (opcao) {
            case 1:
                    System.out.println("Qual habilidade você deseja usar: \n1 --> Bola de fogo"+
                            "\n2 --> Chama negra"+
                            "\n3 --> Choque do trovão"+
                            "\n4 --> Chuva de meteoro \n");
                    break;
            case 2:
                    System.out.println("Qual habilidade você deseja usar: \n1 --> Espada perfurante"+
                            "\n2 --> Tormenta de aço"+
                            "\n3 --> Espada flamejante"+
                            "\n4 --> Santoryu \n");
                    break;
            case 3:
                    System.out.println("Qual habilidade você deseja usar: \n1 --> Flecha estuneante"+
                            "\n2 --> Flecha avassaladora"+
                            "\n3 --> Flecha sonica"+
                            "\n4 --> Flecha divina \n");
                    break;
        }
    }
    @Override
    public double habilidades(int escolha) {
        if (escolha == 1) {
            return Math.ceil(super.causarDano() + (super.causarDano() * (10.0 / 100.0)));
        } else if (escolha == 2) {
            return Math.ceil(super.causarDano() + (super.causarDano() * (40.0 / 100.0)));
        } else if (escolha == 3) {
            return Math.ceil(super.causarDano() + (super.causarDano() * (60.0 / 100.0)));
        } else {
            return Math.ceil(super.causarDano() + (super.causarDano() * (80.0 / 100.0)));
        }
    }

}