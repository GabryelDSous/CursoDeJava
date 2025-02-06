package banco;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OpcoesBanco opcBan = new OpcoesBanco();
        byte leitor = 0;
        System.out.println("Bem-vindo(a) ao banco!");
        System.out.println("O que vamos fazer?");
        System.out.println("-------------------");
        System.out.println("1. Criar uma conta");
        System.out.println("-------------------");
        while(leitor != 6){
            System.out.print("Navegue pelo menu: ");
            while(true){
                try{
                    leitor = scanner.nextByte();
                    break;
                } catch(InputMismatchException e){
                    System.out.print("Escolha uma das opções acima: ");
                    scanner.nextLine();
                }
            }
            if(leitor == 1) opcBan.opicoes(leitor);
            else if(leitor == 2) opcBan.opicoes(leitor);
        }
        
    }
}
