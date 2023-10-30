package ClassesJogador;

import java.util.Random;

public class Batalha{
    private String nome;
    private int opcao;
    private String ganhador;

    private Item item;
    private Random aleatorio;

    public Batalha(String nome, int opcao) {
        this.nome = nome;
        this.opcao = opcao;
    }
    
    public Arqueiro escolha(Arqueiro arqueiro){
        return new Arqueiro(this.nome);
    }
    public Guerreiro escolha(Guerreiro guerreiro){
        return new Guerreiro(this.nome);
    }
    public Mago escolha(Mago mago){
        return new Mago(this.nome);
    }


    public Object escolha(int opcao){
        opcao = this.opcao;
        switch (this.opcao){
            case 1:
                return new Mago(this.nome);
            case 2:
                return new Guerreiro(this.nome);
            case 3:
                return new Arqueiro(this.nome);
            default:
                return null;
        }
    }

    public Object inimigo(int aleatorio){
        switch (aleatorio){
            case 0:
                return new Caveira("Caveira");
            case 1:
                return new Fungo("Fungo");
            default:
                return null;
        }
    }

    public void batalha(){
        this.aleatorio = new Random();
        Object classe = escolha(this.opcao);
        Object inimigo = inimigo(this.aleatorio.nextInt(2));
        Jogador classe_convert = (Jogador) classe;
        Inimigo inimigo2 = (Inimigo) inimigo;
       
        // código do desenvolvimento da batalha 
        int rodada = 0;

        System.out.println("\n"+inimigo2.nome + " APARECEU!!\n");
        while ( (ganhador != classe_convert.nome) && (ganhador != inimigo2.nome)){
            
            if (rodada == 0){
                System.out.println( inimigo2.nome+ " recebeu "
                +classe_convert.mostrarDano()+ " de dano do "+ 
                classe_convert.nome);
                inimigo2.receberDano(classe_convert.causarDano());
                System.out.println(inimigo2.nome + " está com "+inimigo2.mostrarHp()+ 
                " de vida.");
                System.out.println(classe_convert.nome + " está com " + classe_convert.mostrarHp()+
                " de vida.");
                rodada = 1;    
            }
            
            else if ( rodada ==1 ){
                System.out.println(classe_convert.nome+ " recebeu "
                +inimigo2.mostrarDano()+" de dano do "+ inimigo2.nome);
                classe_convert.receberDano(inimigo2.causarDano());
                System.out.println(classe_convert.nome + " está com " + classe_convert.mostrarHp()+
                " de vida.");
                System.out.println(inimigo2.nome + " está com "+inimigo2.mostrarHp()+ 
                " de vida.");
                rodada = 0;
            }

            // Define ganhador. 
            if ( classe_convert.mostrarHp() <= 0 ){
                ganhador = inimigo2.nome;
                System.out.println("\nO vencedor da batalha foi "+inimigo2.nome);
            }
            else if ( inimigo2.mostrarHp() <= 0 ){
                ganhador = classe_convert.nome;
                System.out.println("\nO vencedor da batalha foi "+classe_convert.nome);

                System.out.println("\nDano antes do item: " + classe_convert.mostrarDano());
                Item item = new Item(1);
                classe_convert.aumentarDano(item.cajado());
                System.out.println("Dano após o equipamento do item: " + classe_convert.mostrarDano());
            }
        }        
    }
    
    public String getGanhador() {
        return ganhador;
    }
    
}
