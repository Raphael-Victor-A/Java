/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author rapha
 */
public class GerenteM extends EmpregadoM{
    private int Area;
    private String Local;
    private float Bonus;
    private float Meta; 

   public GerenteM(int Area, String Local, float Bonus, float Meta, int RegistroFuncionario, String Cargo, char FormacaoSuperior, String DataContratacao, DadosPessoaisM dadospessoais) {
        super(RegistroFuncionario, Cargo, FormacaoSuperior, DataContratacao, dadospessoais);
        this.Area = Area;
        this.Local = Local;
        this.Bonus = Bonus;
        this.Meta = Meta;
    }

    public int getArea() {
        return Area;
    }

    public void setArea(int Area) {
        this.Area = Area;
    }

    public String getLocal() {
        return Local;
    }

    public void setLocal(String Local) {
        this.Local = Local;
    }

    public float getBonus() {
        return Bonus;
    }

    public void setBonus(float Bonus) {
        this.Bonus = Bonus;
    }

    public float getMeta() {
        return Meta;
    }

    public void setMeta(float Meta) {
        this.Meta = Meta;
    }
    
    public float Pontuacao(float Meta, float Area){
        float pontuacao;
        if (Meta == Area){
            pontuacao = 100;
        }else if (Meta > Area){
            pontuacao = (Area/Meta)*100;
        }else{
            pontuacao = 0;
        }
        return pontuacao;
    }
}
