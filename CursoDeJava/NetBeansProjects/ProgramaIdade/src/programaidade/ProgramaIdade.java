/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaidade;

import java.time.LocalDateTime;
import java.util.Scanner;
/**
 *
 * @author Gabryel
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        LocalDateTime ANO = LocalDateTime.now();
        int anoAtual = ANO.getYear();
        System.out.print("Em que ano você nasceu: ");
        int ano = teclado.nextInt();
        int idade = anoAtual - ano;
        if(idade >= 18){
            System.out.println("Sua idade é "+ idade + " você é Menor de Idade");
        } else{
            System.out.println("Sua idade é "+ idade + " você é Menor de Idade");
        }
    }
    
}
