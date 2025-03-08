import java.util.Arrays;

public class CursoJava{
    public static void main(String[] args) {
        final int tam = 10;

        int[] num = {9,2,7,1,8,5,3,4,0,6};
        int[] numeros = new int[tam];
        int p = 9;
        int pos;

        //? Arrays.sort(num); organiza os arrays
        //? Arrays.fill(numeros, 10); preenche todos os espaços com o número informado
        //? System.arraycopy(num, 0, numeros, 0, tam);
        //? Arrays.equals(num, numeros);
        //? System.out.printf("Arrays sao iguais: %s", Arrays.equals(num, numeros) ? "Sim" : "Nao");

        Arrays.sort(num);
        pos = Arrays.binarySearch(num, p);
        System.out.printf("O elemento %d esta no Array? %s na posicao %d", p, pos > 0? "Sim" : "Nao", pos);

        /*for(int n:numeros){
            System.out.printf("%d - ", n);
         } */
    }
}