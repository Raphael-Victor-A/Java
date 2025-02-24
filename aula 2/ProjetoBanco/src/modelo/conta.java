package modelo;

public class conta {
    private int conta;
    private int agencia;
    private float saldo;
    private  float limite;
    private dadosPessoais dadosPessoais;
    private endereco endereco;

    public conta(int conta, int agencia, float saldo, float limite, modelo.dadosPessoais dadosPessoais,
            modelo.endereco endereco) {
        this.conta = conta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.limite = limite;
        this.dadosPessoais = dadosPessoais;
        this.endereco = endereco;
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

    public dadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(dadosPessoais dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    public endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(endereco endereco) {
        this.endereco = endereco;
    }

    public void imprimeConta(conta obj){
        System.out.println("Agencia: "+obj.getAgencia());
        System.out.println("Conta: "+obj.getConta());
        System.out.println("Limite: "+obj.getLimite());
        System.out.println("Saldo: "+obj.getSaldo());
        this.getDadosPessoais().impressaoDados(dadosPessoais);
        this.getEndereco().impressaoEndereco(endereco);

    }
    
}
