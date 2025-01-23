package exercicioa02;
public class Evento {
    String local;
    byte hora;
    byte dia;
    String mes;
    short ano;
    boolean convidado;
    void status(){
        System.out.println("O local será em " + this.local);
        System.out.println("No dia " + this.dia + " de " + mes + " do ano de " + this.ano);
        System.out.println("Você foi convidado? " + this.convidado);
    }
}
