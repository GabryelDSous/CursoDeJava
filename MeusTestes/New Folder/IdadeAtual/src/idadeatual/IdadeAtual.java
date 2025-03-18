package idadeatual;

import java.time.LocalDateTime;
import java.util.Scanner;

public class IdadeAtual {
    public static void main(String[] args) {
        LocalDateTime data = LocalDateTime.now();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe seu ano de nascimento: ");
        int anoNasc = scanner.nextInt();
        System.out.print("Informe seu mês de nascimento: ");
        int mesNasc = scanner.nextInt();
        
        int anoAtual = data.getYear();
        int mesAtual = data.getMonthValue();
        
        int diaTotal = 0;
        int mesTotal = 0;
        
        for(int i = anoNasc; i < anoAtual; i++){
            if((i%4==0 && i%100!=0) || i%400==0) diaTotal+=366;
            else diaTotal+=365;
        }
        
        if()
        System.out.printf("Você ao todo tem %d dias de vida%n", diaTotal);
        
    }
    
}
