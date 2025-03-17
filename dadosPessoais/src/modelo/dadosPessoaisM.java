package modelo;

public class dadosPessoaisM {
    private String primeiroNome;
    private String sobrenome;
    private String cpf;
    private char sexo;
    private int idade;

    public dadosPessoaisM(String cpf, int idade, String primeiroNome, char sexo, String sobrenome) {
        this.cpf = cpf;
        this.idade = idade;
        this.primeiroNome = primeiroNome;
        this.sexo = sexo;
        this.sobrenome = sobrenome;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void imprimeDadosPessoais(){
        System.out.println("----Dados pessoais - IMPRESSÃO----");
        System.out.println("Primeiro nome "+ this.getPrimeiroNome());
        System.out.println("Sobrenome: "+ getSobrenome());
        System.out.println("Cpf: "+ getCpf());
        System.out.println("Sexo: "+ getSexo());
        System.out.println("Idade: "+ getIdade());

    }
}
