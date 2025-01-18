package niveis;
import java.util.Random;
import java.util.Scanner;
public class nivelFacil {
    public static void Facil(){
        Random random = new Random();
        int numRandom = random.nextInt(10)+1;
        Scanner scnr = new Scanner(System.in);
        int tentativas = 0;
        int teclado = 0;
        System.out.println("Estou pensando em um número entre 1 e 10. Você tem 5 tentativas.");
        for(byte cc = 0;cc < 5; cc++){
            tentativas++;
            System.out.print("Qual seu palpite: ");
            teclado = scnr.nextInt();    
            if(teclado < 1 || teclado > 10) System.out.println("O número deve estar entre 1 e 10");
            else{
                if(teclado < numRandom) {
                    if(tentativas == 5) break;
                    else System.out.println("Muito Baixo! Tente novamente");
                } else if(teclado > numRandom){
                    if(tentativas == 5) break;
                    else System.out.println("Muito Alto! Tente novamente");
                } else break;  
            }       
        }
        if(teclado == numRandom) System.out.println("Parábens! Você acertou na "+tentativas+"° tentativas.");
        else System.out.println("Infelizmente você não conseguiu acertar, tente novamente");
    }
}