package exercicioa02;
public class Passagem {
    String saída;
    String destino;
    float valor;
    int tipo = 1;
    void status(){
        System.out.println("Uma passagem com saída de " + this.saída + " com destino para " + this.destino);
        System.out.println("A passagem ao todo vai curstar R$" + this.valor);
        System.out.println("Sua passagem é de " + tipo());
    }
    private String tipo(){
        String transporte = "";
        if(tipo == 1) transporte = "Avião";
        else if(tipo == 2) transporte = "Ônibus";
        else if(tipo == 3) transporte = "Trêm";
        else if(tipo == 4) transporte = "Návio";
        return transporte;
    }
}
