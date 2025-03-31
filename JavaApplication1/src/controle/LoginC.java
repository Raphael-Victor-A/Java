/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.util.ArrayList;
import modelo.LoginM;

/**
 *
 * @author rf5974
 */
public class LoginC {
    public ArrayList<LoginM> vetLogin;    
    //Construtor
    public LoginC(){
        vetLogin = new ArrayList<LoginM>();
    }
    //Cadastro de Login
    public void CadastroLogin(LoginM loginm){
        vetLogin.add(loginm);
    }
    //Consulta Por login: retorna a posição do objeto no ArrayList
    public int ConsultaPorLogin(String login){        
        int posicao=-1;
        System.out.println("tamanho vetor: "+vetLogin.size());
        for(int i=0;i<vetLogin.size();i++){
            if(vetLogin.get(i).getLogin().equals(login)){
                posicao=i;
            }            
        }        
        return posicao;                
    }
    public String Autenticacao(String login){
        String texto;
        int posicaoDado = this.ConsultaPorLogin(login);
        if (posicaoDado != -1)
        {
            //Chamar a tela Principal
            texto="Cadastro encontrado!";
        }
        else{
            //informar que login não existe
            //indicar cadastro
            texto="SEM CADASTRO! ";
        }            
        return(texto);
    }
    
    
    public void ListaGeral(){
        for (LoginM dados:vetLogin){
            dados.printAtributos();
        }
    }   
    
    
}//FimDaClasse
