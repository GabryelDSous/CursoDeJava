/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;
/**
 *
 * @author Gabryel
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int s = 0;
        int totVal = 0;
        int par = 0;
        int impar = 0;
        int valMCem = 0;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: <br/><em>(valor 0 interrompe)</em></html>"));
            s+=n;
            totVal++;
            if(n%2==0) par++;
            if(n%2!=0) impar++;
            if(n>100) valMCem++;
        } while(n != 0);
        int mVal = 0;
        mVal = s/totVal;
        JOptionPane.showMessageDialog(null, "<html>Resultado<br/><hr/>"+
        "<br/>Total de valores: "+(totVal-1)
        +"<br/>Total de Pares: "+(par-1)
        +"<br/>Total de Ímpares: "+impar
        +"<br/>Acima de 100: "+valMCem
        +"<br/>Média dos valores: "+mVal+"</html>");
    }
    
}
