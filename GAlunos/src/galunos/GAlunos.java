/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package galunos;

import controle.LoginC;
import modelo.LoginM;
import visao.LoginV;

/**
 *
 * @author rf5974
 */
public class GAlunos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LoginV inicio=new LoginV();
        inicio.setVisible(true);
                
        /*
        LoginM user1=new LoginM("6", "123456");
        LoginC login1=new LoginC();
        boolean res=login1.LoginUsuario(user1);
        System.out.println("Resultado: "+res);
                */
    }
    
}
