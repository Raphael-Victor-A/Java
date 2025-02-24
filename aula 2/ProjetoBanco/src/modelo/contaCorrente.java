package modelo;


public class contaCorrente {
    //alt insert to generate getters and setters 
    private int conta;
    private int agencia;
    private float saldo;
    private float limite;

    public contaCorrente(){
        this.conta=0;
        this.agencia = 0;
        this.limite = 0;
        this.saldo = 0.0f;
    }
    public void deposito(float valor){
        this.saldo = this.saldo+valor;
    }

    public void saque(float valor){
        this.saldo = this.saldo-valor;
    }

    public float saldo(){
        return this.saldo+this.limite;
    }

    public contaCorrente(int conta, int agencia, float saldo, float limite) {
        this.conta = conta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.limite = limite;
    }



    public int getConta() {
        return conta;
    }
    public void setConta(int conta) {
        this.conta = conta;
    }
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public float getLimite() {
        return limite;
    }
    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void impressao(){
        System.out.println("Agencia: "+this.getAgencia());
        System.out.println("Conta: "+this.getConta());
        System.out.println("Limite: "+this.getLimite());
        System.out.println("Saldo: "+this.getSaldo());
    }

    public void impressaoPorObjeto(contaCorrente obj){
        System.out.println("Agencia: "+obj.getAgencia());
        System.out.println("Conta: "+obj.getConta());
        System.out.println("Limite: "+obj.getLimite());
        System.out.println("Saldo: "+obj.getSaldo());
    }
    
}
