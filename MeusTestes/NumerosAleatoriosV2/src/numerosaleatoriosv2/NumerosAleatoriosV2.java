package numerosaleatoriosv2;
import java.util.Scanner;
public class NumerosAleatoriosV2 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Bem-vindo ao jogo de Adivinhação.");
        System.out.println("Escolha o nivel de dificuldade");
        System.out.println("1 - Fácil (1-10, 5 tentativas)\n2 - Médio (1-50, 7 tentativas)\n3 - Difícil (1-100, 10 tentativas)");
        int numInfo = tcl.nextInt();
        if(numInfo == 1){
           Niveis.facil();
        } else if(numInfo == 2){
            Niveis.Medio();
        } else if(numInfo == 3){
            Niveis.Dificil();
        } else {
            System.out.println("O nivel não existe");
        }
    }
    // System.out.println("Estou pensando em um número entre 1 e 10. Você tem 7 tentativas");
}