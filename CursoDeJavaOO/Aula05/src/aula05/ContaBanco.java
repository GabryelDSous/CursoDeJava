package aula05;
public class ContaBanco {
    public int NumConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public ContaBanco() {
        this.status = false;
        this.saldo = 0;
    }
    
    public int getNumConta() {
        return NumConta;
    }

    public void setNumConta(int NumConta) {
        this.NumConta = NumConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String tipo){
        this.tipo = tipo;
        this.status = true;
        if(this.tipo == "CP") this.setSaldo(this.saldo+150);
        else if(this.tipo == "CC") this.setSaldo(this.saldo+50);
        System.out.println("Conta aberta com Sucesso!");
    }
    
    public void fecharConta(){
        if(this.getSaldo() < 0)System.out.println("Você esta em débito com o banco.");
        else if(this.getSaldo() > 0) System.out.println("Conta não pode ser fechada porqe você ainda tem dinheiro na conta.");
        else{
             System.out.println("Conta fechada!");
             this.setStatus(false);
        }
    }
    
    public void depositar(int depositar){
        if(this.isStatus() == true){
            this.saldo+=depositar;
            System.out.println("Depósito realizado na cota de " + this.getDono());
        } else if(this.isStatus() == false) System.out.println("Para realizar deposito a conta deve estar aberta");
    }
    
    public void sacar(int saque){
        if(saque <= this.getSaldo()){
        System.out.println("Saque realizado na conta de " + this.getDono());
        this.setSaldo(this.saldo-saque);
        } else if(saque > this.getSaldo()) System.out.println("Saldo insuficiente para saque");
    }
    
    public void pagarMensal(){
        if(this.getTipo() == "CC") System.out.println("Valor da mensalidade: R$12,00");
        else if(this.getTipo() == "CP") System.out.println("Valor da mensalidade: R$20");
    }
    
    public void estadoAtual(){
        System.out.println("--------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }
    
}
