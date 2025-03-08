public class Jogador {

    private final int maxVidas = 3;
    private int num = 0;
    private int vidas = 0;
    static boolean alerta = false;
    static int qtdJogadores = 0;
    static int pontosJogadores = 0;

    public Jogador(int num) {
        this.num = num;
        this.vidas = 1;
        System.out.printf("Jogador %d criado%n", num);
        qtdJogadores++;
    }

    public int getVidas(){
        return this.vidas;
    }

    public void addVidas(){
        if(vidas < maxVidas){
            this.vidas ++;
        } 
    }

    static void pontos(){
        pontosJogadores += 10;
    }

    public void info(){
        System.out.printf("%nJogador:  %d", this.num);
        System.out.printf("%nVidas: %d", this.vidas);
        System.out.printf("%nAlerta: %s", (alerta ? "Sim" : "Nao"));
        System.out.printf("%nJogadores: %d", qtdJogadores);
        System.out.printf("%nPontos Jogadores: %d", pontosJogadores);
        System.out.printf("%n-----------------------------------");
    }
}
