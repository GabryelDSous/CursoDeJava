package aulapratica06;
public class ControleTv implements Interface{
    private boolean ligado;
    private byte volume;
    private boolean tocando;
    private boolean menu;
    private boolean mudo;
    
    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private byte getVolume() {
        return volume;
    }

    private void setVolume(byte volume) {
        this.volume = volume;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    private boolean isMenu(){
        return menu;
    }
    
    private void setMenu(boolean menu){
        this.menu = menu;
    }
    
    private boolean isMudo(){
        return mudo;
    }
    
    private void setMudo(boolean mudo){
        this.mudo = mudo;
    }

    public ControleTv() {
        this.ligado = false;
        this.volume = 50;
        this.tocando = false;
        this.mudo = false;
    }
    
    @Override
    public void ligar() {
        if(this.isLigado() == false){
            this.setLigado(true);
            System.out.println("TV LIGANDO...");
        }
        else System.out.println("A TV ja esta ligada!");
    }

    @Override
    public void desligar() {
        if(this.isLigado() == true){
            this.setLigado(false);
            System.out.println("TV DESLIGADANDO...");
        }
        else System.out.println("A TV esta desligada!");
    }

    @Override
    public void aumentarVol() {
        if(this.isLigado() == true){
            if(this.getVolume() >= 0){
                this.setMudo(false);
                this.setVolume(this.volume += 5);
                System.out.println("Volume: " + this.getVolume());
            } else if(this.getVolume() == 100) System.out.println("O volume esta no maximo!");
        } else System.out.println("A TV esta desligada!");
    }

    @Override
    public void diminuirVol() {
        if(this.isLigado() == true){
            if(this.getVolume() <= 100){
                this.setVolume(this.volume -= 5);
                System.out.println("Volume: " + this.getVolume());
            }
            else if(this.getVolume() == 0 || this.isMudo() == true) System.out.println("O volume esta no minimo ou mutado!");
        } else System.out.println("A TV esta desligad!");
    }

    @Override
    public void pausar() {
        if(this.isLigado() == true){
            if(this.isTocando() == true) this.setTocando(false);
            else System.out.println("A TV ja esta pausada!");
        } else System.out.println("A TV esta desligada!");
    } 

    @Override
    public void play() {
        if(this.isLigado() == true){
            if(this.isTocando() == false) this.setTocando(true);
            else System.out.println("A TV ja esta tocando algo!");
        } else System.out.println("A TV esta desligada!");
    }

    @Override
    public void menu() {
        if(this.isLigado() == true){
            if(this.isMenu() == false){
                this.setMenu(true);
                System.out.println("--------------------------");
                System.out.println("A TV esta: " + (this.isLigado()==true?"Ligada":"Desligada"));
                System.out.print("Volume:" + (this.isMudo() == true?" Mudo":""));
                for(byte vol = 0; vol < this.getVolume(); vol+=10) System.out.print("|");
                System.out.println("\nO video estar: " + (this.isTocando() == true?"Tocando!":"Pausado!"));
            } else System.out.println("O menu ja esta ativo!");
        } else System.out.println("A TV esta desligada!");
    }

    @Override
    public void mudo() {
        if(this.isLigado() == true){
            if(this.getVolume() > 0 ){
                this.setMudo(true);
                this.setVolume((byte)0);
                System.out.println("Ligando o mudo...");
            } else System.out.println("A TV ja esta no mutada! Aumente o volume para tirar do mudo");
        } System.out.println("A TV esta desligada!");
    }
    
}
