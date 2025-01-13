/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor02;

import java.time.LocalDate;

/**
 *
 * @author Gabryel
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDate ano = LocalDate.now();
        int ANO = ano.getYear();
        String[] mes = {"Jan","Fev","Mar","Abr","Mai",
            "Jun","Jul","Ago","Set","Out","Nov","Dez"};
        int[] tot = {31,28,31,30,31,30,31,31,30,31,30,31};
        if(ANO%4==0){
            if(ANO%100==0){
                if(ANO%400==0){
                    tot[1] = 29;
                }// Não é bissexto
            } else tot[1] = 29;
        }// Não é bissexto
        
        for(int c=0; c<tot.length;c++){
            System.out.println("O mês de "+mes[c]+" tem "+tot[c]+" dias ao todo.");
        }
        if(tot[1] == 29) System.out.println("O ano é Bissexto");
        else System.out.println("O ano não é Bissexto");
    }
}
