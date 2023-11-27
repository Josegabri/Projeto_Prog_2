package ClassesJogador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Jogador extends Propriedades{

    public Jogador(String nome) {
        super(nome);
    }
    protected static List<String> inventarioNome =  new ArrayList<>();
    protected static List<Double> inventarioValor = new ArrayList<>();
    public abstract double usarSt();
    public abstract double mostrarSt();
    public abstract void aumentarDano(double item);
    public abstract void aumentarHp(double item);
    public abstract void aumentarSt(double item);
    double mostrarExp;
    public abstract void aumentarNivel(double experi);
    public abstract Integer mostrarNivel();
    public abstract void aumentarExp (double exper);
    public abstract double mostrarExp();
    public abstract void item(double dano, String nome, String tipo);
    public abstract double getDanoItem();
    public abstract double getHpItem();
    public abstract double getStItem();
    public abstract String getNomeItem();
    public abstract void setDanoItem(Double danoItem);
    public abstract void setStItem(Double stItem);
    public abstract void setHpItem(Double hpItem);
    public abstract void dropItem(int opcao);
    public abstract void aumentarStatus();

    public void mostrarInventario() {
        System.out.println("Você tem os seguintes itens no iventário: ");
        for (String item : inventarioNome) {
            System.out.println(inventarioNome.indexOf(item) + 1  + " ---> " + item);
        }
    }

    public void equiparItem() {
        this.mostrarInventario();
        Scanner scanner = new Scanner(System.in);
        if (!inventarioNome.isEmpty()) {
            System.out.print("Escolha um item para usar: ");
            int escolha = scanner.nextInt();
            for (int i = 0; i < inventarioValor.size(); i++) {
                if (escolha - 1 == i) {

                    if(inventarioNome.get(i) == "Colar comum" || inventarioNome.get(i) == "Colar raro" || inventarioNome.get(i) == "Colar lendário"){
                        this.setStItem(inventarioValor.get(i));
                        System.out.println("Você equipou item " + inventarioNome.get(i) + " seu ST aumentou em " + inventarioValor.get(i));
                        System.out.println("Seu ST atual é de: " + this.mostrarSt());
                    }else if(inventarioNome.get(i) == "Armadura comum" || inventarioNome.get(i) == "Armadura rara" || inventarioNome.get(i) == "Armadura lendária"){
                        this.setHpItem(inventarioValor.get(i));
                        System.out.println("Você equipou item " + inventarioNome.get(i) + " seu HP aumentou em " + inventarioValor.get(i));
                        System.out.println("Seu HP atual é de: " + this.mostrarHp());
                    }else{
                        this.setDanoItem(inventarioValor.get(i));
                        System.out.println("Você equipou o item " + inventarioNome.get(i) +" de dano: " + inventarioValor.get(i));
                        System.out.println("Seu dano atual é de: " + this.causarDano());
                    }

                }
            }
        }else{
            System.out.println("Você não possui nenhum item");
        }
    }
}
