/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author Gabryel
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        System.out.print("Quantas pernas? ");
        int perna = tec.nextInt();
        String type;
        System.out.print("Isse é um(a)");
        switch (perna){
            case 1:
                type = "Saci";
                break;
            case 2: 
                type = "Bipede";
                break;
            case 4: 
                type = "Quadrupede";
                break;
            case 6, 8:
                type = "Aranha";
                break;
            default: 
                type = "ET";
        }
        System.out.println(type);
    }
    
}
