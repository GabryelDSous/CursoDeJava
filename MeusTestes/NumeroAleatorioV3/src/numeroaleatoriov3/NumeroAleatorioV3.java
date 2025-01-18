package numeroaleatoriov3;
import java.util.Scanner;
import niveis.nivelDificil;
import niveis.nivelFacil;
import niveis.nivelMedio;

public class NumeroAleatorioV3 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int escolha = 0;
        String continuar = "";
        System.out.println("Bem-vindo ao jogo de Adivinhação!");
        System.out.println("Escolha o nivel de dificuldade");
        System.out.println("1 - Fácil (1-10, 5 tentativas)");
        System.out.println("2 - Médio (1-50, 7 tentativas)");
        System.out.println("3 - Difícil (1-100, 10 tentativas)");
        while (escolha != 1 && escolha != 2 && escolha != 3){
            System.out.print("Digite sua escolha [1] [2] [3]: ");
            escolha = teclado.nextInt();
        }
        if(escolha == 1) nivelFacil.Facil();
        else if(escolha == 2) nivelMedio.Medio();
        else nivelDificil.Dificil();
    }
}
