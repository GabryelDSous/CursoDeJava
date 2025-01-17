package numerosaleatoriosv2;
import java.util.Scanner;
import java.util.Random;

public class Niveis {
    public static void facil(){
        Random random = new Random();
        Scanner teclado = new Scanner(System.in);
        int numRandom = random.nextInt(10)+1;
        int cc = 0;
        int numInfo = 0;
        int tentativa = 0;
        System.out.println("Estou pensando em um número entre 1 e 10. Você tem 5 tentativas.");
        while(cc < 5){
            tentativa++;
            System.out.print("Qual o seu palpite: ");
            numInfo = teclado.nextInt();
            if(numInfo < 1 || numInfo > 10){
                System.out.println("O número deve estar entre 1 e 10");
            } else{
                if(numInfo < numRandom) System.out.println("Muito Baixo! Tente novamente");
                else if(numInfo > numRandom) System.out.println("Muito Alto! Tente novamente");
                else break;
            }
            cc++;
        }
        if(numInfo == numRandom){
            System.out.println("Parabéns! Você acertou o número " +numInfo+ " na " +tentativa+ "° tentativa!");
        } else System.out.println("Infelizmente você não conseguiu acertar, tente novamente");
    }
    
    public static void Medio(){
        Random random = new Random();
        Scanner teclado = new Scanner(System.in);
        int numRandom = random.nextInt(50)+1;
        int cc = 0;
        int numInfo = 0;
        int tentativa = 0;
        System.out.println("Estou pensando em um número entre 1 e 50. Você tem 7 tentativas.");
        while(cc < 7){
            tentativa++;
            System.out.print("Qual o seu palpite: ");
            numInfo = teclado.nextInt();
            if(numInfo < 1 || numInfo > 50){
                System.out.println("O número deve estar entre 1 e 50");
            } else{
                if(numInfo < numRandom) System.out.println("Muito Baixo! Tente novamente");
                else if(numInfo > numRandom) System.out.println("Muito Alto! Tente novamente");
                else break;
            }
            cc++;
        }
        if(numInfo == numRandom){
            System.out.println("Parabéns! Você acertou o número " +numInfo+ " na " +tentativa+ "° tentativa!");
        } else System.out.println("Infelizmente você não conseguiu acertar, tente novamente");
    }
    
    public static void Dificil(){
        Random random = new Random();
        Scanner teclado = new Scanner(System.in);
        int numRandom = random.nextInt(100)+1;
        int cc = 0;
        int numInfo = 0;
        int tentativa = 0;
        System.out.println("Estou pensando em um número entre 1 e 100. Você tem 10 tentativas.");
        while(cc < 10){
            tentativa++;
            System.out.print("Qual o seu palpite: ");
            numInfo = teclado.nextInt();
            if(numInfo < 1 || numInfo > 100){
                System.out.println("O número deve estar entre 1 e 100");
            } else{
                if(numInfo < numRandom) System.out.println("Muito Baixo! Tente novamente");
                else if(numInfo > numRandom) System.out.println("Muito Alto! Tente novamente");
                else break;
            }
            cc++;
        }
        if(numInfo == numRandom){
            System.out.println("Parabéns! Você acertou o número " +numInfo+ " na " +tentativa+ "° tentativa!");
        } else System.out.println("Infelizmente você não conseguiu acertar, tente novamente");
    }
}