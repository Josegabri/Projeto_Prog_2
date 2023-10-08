package ClassesJogador;
public class Escolha {

    public Object escolha(int opcao, String nome){

        switch (opcao){
            case 1:
                return new Arqueiro(nome);
            case 2:
                return new Guerreiro(nome);
            case 3:
                return new Mago(nome);
        }
        return null;
    }
}
