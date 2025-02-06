package banco;
import java.util.Scanner;
import java.util.ArrayList;
public class OpcoesBanco {
    public void opicoes(byte num){
        Scanner scanner = new Scanner(System.in);
        ArrayList<GerenciarConta> GConta = new ArrayList<>();
        if(num == 1){
            String regex = "^[a-zA-Z\\s]+$";
            String nome;
            System.out.print("Informe seu nome(sem números ou caracteres acentuados): ");
            nome = scanner.nextLine();
            while(true){
                if(nome.matches(regex)){
                    break;
                } else{
                    System.out.print("O nome não deve conter números ou simbolos: ");
                    scanner.nextLine(); 
                }
                nome = scanner.nextLine();
            }
            System.out.print("Quantos anos você tem? ");
            short idade = scanner.nextShort();
            //GConta.add(new GerenciarConta(nome,idade));
            GConta.add(new GerenciarConta(nome,idade));
        } else if(num == 2){
            System.out.println("Bem-Vindo " + GConta.get(1).getNome());
        }
    }
}
