/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author rapha
 */
public class VendedorM extends EmpregadoM{

    
    private String Setor;
    private int TotalDeVendas;
    private float MetaDeVenda;
    private float Salario;
    private String DataInicio;
    private String DataTermino;
    
    public VendedorM(String Setor, int TotalDeVendas, float MetaDeVenda, float Salario, String DataInicio, String DataTermino, int RegistroFuncionario, String Cargo, char FormacaoSuperior, String DataContratacao, DadosPessoaisM dadospessoais) {
        super(RegistroFuncionario, Cargo, FormacaoSuperior, DataContratacao, dadospessoais);
        this.Setor = Setor;
        this.TotalDeVendas = TotalDeVendas;
        this.MetaDeVenda = MetaDeVenda;
        this.Salario = Salario;
        this.DataInicio = DataInicio;
        this.DataTermino = DataTermino;
    }
    
    public String getSetor() {
        return Setor;
    }

    public void setSetor(String Setor) {
        this.Setor = Setor;
    }

    public int getTotalDeVendas() {
        return TotalDeVendas;
    }

    public void setTotalDeVendas(int TotalDeVendas) {
        this.TotalDeVendas = TotalDeVendas;
    }

    public float getMetaDeVenda() {
        return MetaDeVenda;
    }

    public void setMetaDeVenda(float MetaDeVenda) {
        this.MetaDeVenda = MetaDeVenda;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float Salario) {
        this.Salario = Salario;
    }

    public String getDataInicio() {
        return DataInicio;
    }

    public void setDataInicio(String DataInicio) {
        this.DataInicio = DataInicio;
    }

    public String getDataTermino() {
        return DataTermino;
    }

    public void setDataTermino(String DataTermino) {
        this.DataTermino = DataTermino;
    }

    public float Salario(float salario, float TotalDeVendas){
        float salarioFinal;
        if (TotalDeVendas >= MetaDeVenda){
            salarioFinal = salario + (salario*0.1f);
        }else{
            salarioFinal = salario - (salario*0.1f);
        }
        return salarioFinal;
    }

    public void Pontuacao(float TotalDeVendas, float MetaDeVenda){
        float pontuacao;
        if (TotalDeVendas == MetaDeVenda){
            pontuacao = 100;
        }else if (TotalDeVendas > MetaDeVenda){
            pontuacao = (MetaDeVenda/TotalDeVendas)*100;
        }else{  
            pontuacao = 0;
        }
        System.out.println("Pontuacao: " + pontuacao);
    }
    
}
