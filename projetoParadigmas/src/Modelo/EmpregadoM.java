/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author rapha
 */
public class EmpregadoM {

    private int RegistroFuncionario;
    private String Cargo;
    private char FormacaoSuperior;//(S,M)
    private String DataContratacao;
    private DadosPessoaisM dadospessoais;
    
    public EmpregadoM(int RegistroFuncionario, String Cargo, char FormacaoSuperior, String DataContratacao, DadosPessoaisM dadospessoais) {
        this.RegistroFuncionario = RegistroFuncionario;
        this.Cargo = Cargo;
        this.FormacaoSuperior = FormacaoSuperior;
        this.DataContratacao = DataContratacao;
        this.dadospessoais = dadospessoais;
    }

    public EmpregadoM() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getRegistroFuncionario() {
        return RegistroFuncionario;
    }

    public void setRegistroFuncionario(int RegistroFuncionario) {
        this.RegistroFuncionario = RegistroFuncionario;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public char getFormacaoSuperior() {
        return FormacaoSuperior;
    }

    public void setFormacaoSuperior(char FormacaoSuperior) {
        this.FormacaoSuperior = FormacaoSuperior;
    }

    public String getDataContratacao() {
        return DataContratacao;
    }

    public void setDataContratacao(String DataContratacao) {
        this.DataContratacao = DataContratacao;
    }

    public DadosPessoaisM getDadospessoais() {
        return dadospessoais;
    }

    public void setDadospessoais(DadosPessoaisM dadospessoais) {
        this.dadospessoais = dadospessoais;
    }

    public int Idade() {
        int anoAtual = java.time.Year.now().getValue();
        return anoAtual - dadospessoais.AnoNascimento(anoAtual, anoAtual);
    }

    public void PrintEmpregado() {
        System.out.println("Registro Funcionario: " + RegistroFuncionario);
        System.out.println("Cargo: " + Cargo);
        System.out.println("Formacao Superior: " + FormacaoSuperior);
        System.out.println("Data Contratacao: " + DataContratacao);

    }

    public void setNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setSobrenome(String sobrenome) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setCpf(String cpf) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setIdade(String idade) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setSexo(String sexo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setFormacaoSuperior(String formacaoSuperior) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setRegistroFuncionario(String registroFuncionario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
