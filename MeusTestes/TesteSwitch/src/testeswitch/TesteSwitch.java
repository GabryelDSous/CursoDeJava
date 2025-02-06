package testeswitch;
import java.util.Scanner;
public class TesteSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual sua escolha: ");
        int num = scanner.nextInt();
        switch (num){
            case 1:
                System.out.println("Primeiro Lugar");
                break;
            case 2: 
                System.out.println("Segundo Lugar");
                break;
            case 3:
                System.out.println("Terceiro lugar");
                break;
            default:
                System.out.println("Infelizmente você não foi classificado.");
                break;
        }
    }
    
}
