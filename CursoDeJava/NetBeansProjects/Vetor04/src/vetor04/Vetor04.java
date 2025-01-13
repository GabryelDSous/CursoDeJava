/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor04;
import java.util.Arrays;
/**
 *
 * @author Gabryel
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO cint[] vet = {3,7,6,1,9,4,2,8};ode application logic here
        int[] vet = {3,7,6,1,9,4,2,8};
        for(int v: vet){
            System.out.print(v+" ");
        }
        int p = Arrays.binarySearch(vet,10);
        System.out.println("Encontrei o valor na posicao "+p);
    }
    
}
