package meubanco;
import java.util.Scanner;
public class MeuBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte escolha = 0;
        System.out.println("Bem-vindo ao banco!");
        while(escolha != 6){
            System.out.println("--------------------------");
            System.out.println("O que você quer fazer?");
            System.out.println("1. Abrir uma nova conta no Banco.");
            System.out.println("--------------------------");
            System.out.print("Qual sua escolha: ");
            while(!scanner.hasNextByte()){
                System.out.print("Escolha uma opção da lista: ");
                scanner.nextLine();
            }
            escolha = scanner.nextByte();
            scanner.nextLine();
            Escolhas escolhas = new Escolhas(escolha);
            if(escolha == 1){
                escolhas.Escolhas();
                if(escolhas.getFechar()){
                    escolha = 6;
                    break;
                }
            }
        }
        System.out.println("Volte Sempre!");
    }
}
