package modelo;

public class funcionarioM {
    private int codFuncionario;
    private String nomeFuncionario;
    private char regimeTrabalho;
    private String dataContratacao;

    public funcionarioM(int codFuncionario, String dataContratacao, String nomeFuncionario, char regimeTrabalho) {
        this.codFuncionario = codFuncionario;
        this.dataContratacao = dataContratacao;
        this.nomeFuncionario = nomeFuncionario;
        this.regimeTrabalho = regimeTrabalho;
    }

    public int getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public char getRegimeTrabalho() {
        return regimeTrabalho;
    }

    public void setRegimeTrabalho(char regimeTrabalho) {
        this.regimeTrabalho = regimeTrabalho;
    }

    public String getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public void exibirFuncionario(){
        System.out.println("codFunc: "+ getCodFuncionario());
        System.out.println("dataContratacao: "+ getDataContratacao());
        System.out.println("nomeFunc: "+ getNomeFuncionario());
        System.out.println("regimeTrabalho: "+ getRegimeTrabalho());

    }
}
