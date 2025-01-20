package pacotenivel;
import java.util.Random;
import java.util.Scanner;
public class niveis {
    public static void Niveis(int tentativas, int numMax){
        System.out.println("Estou pensando em um número entre 1 e " +numMax+ ".\nVocê tem " +tentativas+ " tentativas. ");
        Random random = new Random();
        int numRandom = random.nextInt(numMax)+1;
        Scanner tcld = new Scanner(System.in);
        int teclado = 0;
        int jtentativas = 0;
        int stentativas = tentativas;
        for(int cc = 0; cc < tentativas; cc++){
            System.out.print("Qual seu palpite: ");
            teclado = tcld.nextInt();
            jtentativas++;
            stentativas--;
            if((teclado < 1 || teclado > numMax) && stentativas !=0) System.out.println("O número deve estar entre 0 e " 
            +numMax+ ". Você tem " +stentativas+ " chances, tente novamente");
            else if(stentativas == 0) break; 
            else{
                if(stentativas != 0){
                    if(teclado < numRandom) System.out.println("Muito baixo! Você tem " +stentativas+ " chances, tente novamente");
                    else if(teclado > numRandom) System.out.println("Muito Alto! Você tem " +stentativas+ " chances, tente novamente");
                } else break;
                if(jtentativas == tentativas || teclado == numRandom) break;
            }
        }
        if(teclado == numRandom) System.out.println("Você acertou na " +jtentativas+ "° tentiva");
        else System.out.println("Infelizmente suas tentativas se esgotaram!");
    }
}