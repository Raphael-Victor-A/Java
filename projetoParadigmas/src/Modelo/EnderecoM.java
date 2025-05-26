/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author rapha
 */
public class EnderecoM {
    
    private String Rua;
    private int Numero;
    private String Bairro;
    private String Estado;
    private String Cep;
    private String Complemento;

    public EnderecoM(String Rua, int Numero, String Bairro, String Estado, String Cep, String Complemento) {
        this.Rua = Rua;
        this.Numero = Numero;
        this.Bairro = Bairro;
        this.Estado = Estado;
        this.Cep = Cep;
        this.Complemento = Complemento;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getCep() {
        return Cep;
    }

    public void setCep(String Cep) {
        this.Cep = Cep;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }
    
    public void PrintEndereco(){
        System.out.println("Rua: "+ getRua());
        System.out.println("Numero: "+ getNumero());
        System.out.println("Bairro: "+ getBairro());
        System.out.println("Estado: "+ getEstado());
        System.out.println("Cep: "+ getCep());
        System.out.println("Complemento: "+ getComplemento());
    }
 
    
}
