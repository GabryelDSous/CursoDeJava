package pacotemain;
import java.util.Scanner;
import pacotenivel.niveis;
public class NumerosAleatorioV4{
    public static void main(String[] args) {
        Scanner tcld = new Scanner(System.in);
        int teclado = 0;
        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Escolha o nível de dificuldade:");
        System.out.println("1 - Fácil (1-10, 5 tentativas)");
        System.out.println("2 - Médio (1-50, 7 tentativas)");
        System.out.println("3 - Difícil (1-100, 10 tentativas)");
        while(teclado != 1 && teclado != 2 && teclado != 3){
            System.out.print("Digite sua escolha(entre 1 e 3): ");
            teclado = tcld.nextInt();
        }
        if(teclado == 1) niveis.Niveis(5, 10);
        else if(teclado == 2) niveis.Niveis(7, 50);
        else niveis.Niveis(10, 100);
    }
}