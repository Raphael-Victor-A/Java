package modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rapha
 */
public class DadosPessoaisM {
    String nomeCompleto;
    String cpf;
    int idade;
    char sexo;
    String dataNascimento;
    
    
    public DadosPessoaisM(String nomeCompleto, String cpf, int idade, char sexo, String dataNascimento) {
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }
   
    
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
}
