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

    @Override
    public double habilidades(int escolha) {
        if (escolha == 1) {
            super.setSt(super.mostrarSt() - (super.mostrarSt() * (20.0 / 100.0)));
            return super.causarDano() + (super.causarDano() * (10.0 / 100.0));
        } else if (escolha == 2) {
            super.setSt(super.mostrarSt() - (super.mostrarSt() * (40.0 / 100.0)));
            return super.causarDano() + (super.causarDano() * (40.0 / 100.0));
        } else if (escolha == 3) {
            super.setSt(super.mostrarSt() - (super.mostrarSt() * (60.0 / 100.0)));
            return super.causarDano() + (super.causarDano() * (60.0 / 100.0));
        } else {
            super.setSt(super.mostrarSt() - (super.mostrarSt() * (80.0 / 100.0)));
            return super.causarDano() + (super.causarDano() * (80.0 / 100.0));
        }
    }


    //Dropa um item de acordo com a classe
    @Override
    public void dropItem(int opcao) {
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(150);
        if (opcao == 1) {
            if (valor <= 49) {
                itemMago();
            } else if (valor <= 99) {
                itemHp();
            } else {
                itemSt();
            }
        } else if (opcao == 2) {
            if (valor <= 99) {
                itemGuerreiro();
            } else if (valor <= 99) {
                itemHp();
            } else {
                itemSt();
            }
        } else {
            if (valor <= 49) {
                itemArqueiro();
            } else if (valor <= 99) {
                itemHp();
            } else {
                itemSt();
            }
        }

    }


    //Algoritmo de chance de drop de item
    @Override
    public void itemMago() {
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(150);
        if (valor <= 49) {
            super.item(5, "Cajado comum", "dano");
        } else if (valor <= 84) {
            super.item(10, "Cajado raro", "dano");
        } else if (valor <= 99) {
            super.item(15, "Cajado lendário", "dano");
        } else {
            System.out.println("Nenhum item dropado");
        }
    }

    @Override
    public void itemGuerreiro() {
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(150);
        if (valor <= 49) {
            super.item(5, "Espada comum", "dano");
        } else if (valor <= 84) {
            super.item(10, "Espada rara", "dano");
        } else if (valor <= 99) {
            super.item(15, "Espada lendária", "dano");
        } else {
            System.out.println("Nenhum item dropado");
        }

    }

    @Override
    public void itemArqueiro() {
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(150);
        if (valor <= 49) {
            super.item(5, "Arco comum", "dano");
        } else if (valor <= 84) {
            super.item(10, "Arco raro", "dano");
        } else if (valor <= 99) {
            super.item(15, "Arco lendário", "dano");
        } else {
            System.out.println("Nenhum item dropado");
        }
    }

    @Override
    public void itemHp() {
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(150);
        if (valor <= 49) {
            super.item(5, "Armadura comum", "hp");
        } else if (valor <= 84) {
            super.item(10, "Armadura rara", "hp");
        } else if (valor <= 99) {
            super.item(15, "Armadura lendária", "hp");
        } else {
            System.out.println("Nenhum item dropado");
        }
    }


    @Override
    public void itemSt() {
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(150);
        if (valor <= 49) {
            super.item(5, "Colar comum", "st");
        } else if (valor <= 84) {
            super.item(10, "Colar raro", "st");
        } else if (valor <= 99) {
            super.item(15, "Colar lendário", "st");
        } else {
            System.out.println("Nenhum item dropado");
        }
    }

    @Override
    public void mostrarInventario() {
        System.out.println("Você tem os seguintes itens no iventário: ");
        for (String item : inventarioNome) {
            System.out.println(inventarioNome.indexOf(item) + 1 + " ---> " + item);
        }
    }

    @Override
    public void mostrarHabilidades(int opcao) {
        switch (opcao) {
            case 1 ->
                    System.out.println("Qual habilidade você deseja usar: \n1 --> Bola de fogo \n2 --> Chama negra \n3 --> Choque do trovão \n4 --> Chuva de meteoro");
            case 2 ->
                    System.out.println("Qual habilidade você deseja usar: \n1 --> Espada perfurante \n2 --> Tormenta de aço \n3 --> Espada flamejante \n4 --> Santoryu");
            case 3 ->
                    System.out.println("Qual habilidade você de seja usar: \n1 --> Flecha estuneante \n2 --> Flecha avassaladora \n3 --> Flecha sonica \n4 --> Flecha divina");
        }
    }


}