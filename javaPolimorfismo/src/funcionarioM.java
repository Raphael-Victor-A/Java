public class funcionarioM {
    private int rf;
    private float ch;
    private int numeroSalario;
    private boolean gratificacao;
    private float valorHora;

    public funcionarioM(int rf, float ch, int numeroSalario, boolean gratificacao, float valorHora) {
            this.rf = rf;
            this.ch = ch;
            this.numeroSalario = numeroSalario;
            this.gratificacao = gratificacao;
            this.valorHora = valorHora;
        }

    public int getRf() {
        return rf;
    }
    public void setRf(int rf) {
        this.rf = rf;
    }
    public float getCh() {
        return ch;
    }
    public void setCh(float ch) {
        this.ch = ch;
    }
    public int getNumeroSalario() {
        return numeroSalario;
    }
    public void setNumeroSalario(int numeroSalario) {
        this.numeroSalario = numeroSalario;
    }
    public boolean isGratificacao() {
        return gratificacao;
    }
    public void setGratificacao(boolean gratificacao) {
        this.gratificacao = gratificacao;
    }
    public float getValorHora() {
        return valorHora;
    }
    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }
    
}
