/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author Gabryel
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tcl = new Scanner(System.in);
        int n, s=0;
        String resp;
        do{
            System.out.print("Digite um número: ");
            n = tcl.nextInt();
            s+=n;
            System.out.print("Quer continuar? [S/N]");
            resp = tcl.next();
        } while(resp.equals("S"));
        System.out.println("A soma dos números digitados foram: "+s);
    }
    
}
