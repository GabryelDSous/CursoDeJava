package exercicioa02;
public class Carro {
    String cor;
    String marca;
    int portas;
    int tipo;
    boolean ligado;
    void tipoCarro(){
        if(tipo == 1) System.out.println("É um carro popular.");
        else if(tipo == 2) System.out.println("É um carro esportivo");
        else if(tipo == 3) System.out.println("É um carro blindado");
    }
    void ligado(){
        if(ligado == true) System.out.println("O carro esta ligado");
        if(ligado == false) System.out.println("O carro esta desligado");
    }
    void status(){
        System.out.println("É um carro de cor " + this.cor);
        System.out.println("Da marca " + this.marca);
        System.out.println("Tem " + this.portas + " portas");
    }
}
