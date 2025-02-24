package modelo;

public class dadosPessoais {
    private String nome;
    private String sobrenome;
    private int cpf;
    private int idade;
    private char sexo;

    public dadosPessoais(String nome, String sobrenome, int cpf, int idade, char sexo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
    }
    

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    public void impressaoDados(dadosPessoais obj){
        System.out.println("Primeiro nome: "+this.getNome());
        System.out.println("sobrenome: "+this.getSobrenome());
        System.out.println("cpf: "+this.getCpf());
        System.out.println("idade: "+this.getIdade());
        System.out.println("Sexo: "+this.getSexo());

    }

}
