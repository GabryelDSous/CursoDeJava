/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeroaleatorio;
import java.util.Random;
import java.util.Scanner;
public class NumeroAleatorio {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner tcl = new Scanner(System.in);
        int numRandom = random.nextInt(100)+1;
        int numInfo = 0;
        int tentativas = 0;
        System.out.println("Estou pensando em número, tente adivinhar [1-100]");
        System.out.println("Qual seu Palpite: \b");
        while(numInfo != numRandom){
            tentativas++;
            numInfo = tcl.nextInt();
            if(numInfo < 1 || numInfo > 100){
                System.out.println("O número deve estar entre 1 e 100");
            } else if(numInfo < numRandom){
                System.out.println("Muito baixo! Tente de novo.");
            } else if(numInfo > numRandom){
                System.out.println("Muito alto! Tente de novo.");
            } else break;
        }
        System.out.println("Parábens! Você pensou no número "+numInfo+". Você acertou em "+tentativas+" tentativas");
    }
}