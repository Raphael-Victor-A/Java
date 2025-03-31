/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema;

import controle.LoginC;
import modelo.LoginM;
import visao.LoginV;

/**
 *
 * @author rf5974
 */
public class Sistema {
    public static LoginC dados;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LoginV telaprincipal=new LoginV();
        telaprincipal.setLocation(370, 200);
        telaprincipal.show();
        dados=new LoginC();
        
        LoginM teste=new LoginM("a","a");
        LoginM teste2=new LoginM("c","c");
        dados.CadastroLogin(teste);     
        dados.CadastroLogin(teste2);   
        
        int r=dados.ConsultaPorLogin("c");
        System.out.println("posicao: "+r);
        dados.ListaGeral();
    }
    
}
