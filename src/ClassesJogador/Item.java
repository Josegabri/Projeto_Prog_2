package ClassesJogador;
//Adicionando itens
public class Item {
    private int nivel;
    //private int item;

    public Item(int nivel) {
        this.nivel = nivel;
    }

    protected int espada(){
        System.out.println("Você pegou a espada");
        int base = 10;
        return base*this.nivel;
    }
    public int cajado(){
        System.out.println("Você pegou o cajado");
        int base = 10;
        return base*this.nivel;
    }


    protected int arco(){
        System.out.println("Você pegou o arco");
        int base = 10;
        return base*this.nivel;
    }



}
