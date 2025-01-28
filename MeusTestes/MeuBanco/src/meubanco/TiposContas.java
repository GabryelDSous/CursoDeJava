package meubanco;
public class TiposContas {
    private String nome;
    private short anoNasc;
    private float saldo;
    private short numConta;
    private String tipo;
    public TiposContas(String nome, short anoNasc) {
        this.nome = nome;
        this.anoNasc = anoNasc;
        this.saldo = saldo;
        this.numConta = numConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public short getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(short anoNasc) {
        this.anoNasc = anoNasc;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public short getNumConta() {
        return numConta;
    }

    public void setNumConta(short numConta) {
        this.numConta = numConta;
    }
    
    
    public String mostraStatus(){
        return this.nome;
    }
}
