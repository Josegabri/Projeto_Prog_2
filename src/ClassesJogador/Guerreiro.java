package ClassesJogador;

public class Guerreiro extends Jogador{

    protected double dano = 10;
    protected double hp = 25;
    protected double st = 10;
    protected Integer nivel = 1;
    protected double exp= 0;
    protected double min_exp = nivel* 8;
    protected double danoItem;
    protected double hpItem;
    protected double stItem;
    protected String nomeItem;
    protected Item item;


    public Guerreiro(String nome) {
        super(nome);
        this.item = new Item(this);

    }

    @Override
    public double causarDano() {
        return this.dano;
    }

    @Override // ainda para ser alterado
    double usarSt() {
        this.st -= 7 ;
        return this.dano+4;
    }

    @Override
    public double receberDano(double dano) {
        this.hp -= dano;
        return this.hp;
    }

    @Override
    public double mostrarHp() {
        return this.hp;
    }

    @Override
    public double mostrarDano() {
        return this.dano;
    }

    @Override
    double mostrarSt() {
        return this.st;
    }

    @Override
    public void aumentarDano(double item) {
        this.dano += item;
    }

    @Override
    void aumentarHp(double item) {
    }

    @Override
    void aumentarSt(double item) {

    }

    @Override
    public String aumentarNivel(double experi) {
        if (experi > min_exp){ 
            nivel+=1;
            return "Ganhou " + experi+ " de experiência "
            +"\nVocê aumentou de nível!!" + "\n" + 
            "Está no nível " + nivel+ ".";
         }
         else {
            return "Ganhou " + experi+ " de experiência "
            +"\nVocê precisa de "+ (min_exp - experi) + 
            " para avançar de nível.";
         }
    }

    @Override
    Integer mostrarNivel() {
        return this.nivel;    
    }

    @Override
    
    public void aumentarExp(double exper) {
        exp += exper;
    }

    @Override
    public double mostrarExp() {
        return this.exp;
    }

    @Override
    public Item equiparItem() {
        return this.item;
    }

    @Override
    public void item(double dano, String nome, String tipo) {
        if (tipo == "dano") {
            this.danoItem = dano;
            this.nomeItem = nome;
        } else if (tipo == "hp"){
            this.hpItem = dano;
            this.nomeItem = nome;
        } else {
            this.stItem = dano;
            this.nomeItem = nome;
        }
    }

    @Override
    public String nomeItem() {
        return this.nomeItem;
    }

    @Override
    public double danoItem(){
        return this.danoItem;
    }

//    @Override
//    public void item() {
//        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'item'");
//    }
//
//    @Override
//    public String nomeItem() {
//        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'nomeItem'");
//    }
}

