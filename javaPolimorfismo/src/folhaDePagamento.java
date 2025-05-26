public class folhaDePagamento {
    public float salario(float valorHora, int qtdHora){
        return(valorHora*qtdHora);
    }
    public float salario(float valorHora, int qtdHora, float gratificacao){
        return ((valorHora*qtdHora)+ gratificacao);
    }

    public float salario(int numeroSalario, float salarioMinimo){
        return (numeroSalario*salarioMinimo);
    }
}
