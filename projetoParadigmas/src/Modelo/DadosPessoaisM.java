/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author rapha
 */
public class DadosPessoaisM {

    private String Nome;
    private String Sobrenome;
    private String Cpf;
    private int Idade;
    private char sexo;
    private EnderecoM endereco;
    
    public DadosPessoaisM(String Nome, String Sobrenome, String Cpf, int Idade, char sexo, EnderecoM endereco) {
        this.Nome = Nome;
        this.Sobrenome = Sobrenome;
        this.Cpf = Cpf;
        this.Idade = Idade;
        this.sexo = sexo;
        this.endereco = endereco;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public EnderecoM getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoM endereco) {
        this.endereco = endereco;
    }
    
    public int AnoNascimento(int Idade, int AnoAtual){
        int AnoNascimento = AnoAtual - Idade;
        return AnoNascimento;
    }
 
    public boolean MaiorIdade(int AnoNascimento){
        
        int AnoAtual = java.time.Year.now().getValue();
        int idade = AnoAtual - AnoNascimento;
        return idade>=18;
        
        
    }

    public void ImprimeDados(){
        System.out.println("Nome: " + Nome);
        System.out.println("Sobrenome: " + Sobrenome);
        System.out.println("CPF: " + Cpf);
        System.out.println("Idade: " + Idade);
        System.out.println("Sexo: " + sexo);
        endereco.PrintEndereco();
    }
}
