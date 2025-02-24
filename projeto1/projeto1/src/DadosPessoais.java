public class DadosPessoais {
    private String primeiroNome;
    private String sobrenome;
    private int idade;
    private String cpf;
    private char sexo;
    private String dataNascimento;
    

    public void imprimirDP(){
        System.out.println("dados pessoais: ");
        System.out.println("Primeiro nome: " + this.getPrimeiroNome());
        System.out.println("Sobrenome: " + this.getSobrenome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Data de nascimento: " + this.getDataNascimento());

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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
