package exercicioa02;
public class Geladeira {
    String cor;
    int portas;
    float litros;
    boolean ligada;
    void gelar(){
        if(ligada == true) System.out.println("A agua esta gelada");
        else System.out.println("A agua esta quente, favor ligar a geladeira");
    }
    void status(){
        System.out.println("A cor da geladeira é: " + this.cor);
        System.out.println("Ela tem " + this.portas + " portas");
        System.out.println("Tendo uma capacidade de " + this.litros + " litros");
        System.out.println("Ela está ligada?" + this.ligada);
    }
}
