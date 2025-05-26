/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controle;
import controle.BancoDados;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.LoginM;

/**
 *
 * @author rf5974
 */
public class LoginC {
    public boolean acesso;
    BancoDados bd=new BancoDados();
    
    public boolean LoginUsuario(LoginM obj){
        try{
            bd.conexao();
            String sql="select registro,senha from login where registro='"+obj.getRf()+"'";
            ResultSet dados=bd.getStatement().executeQuery(sql);
            dados.next();            
            String user= dados.getString(1);            
            
            if(user.equals(obj.getRf())){
                acesso=true;
                System.out.println("RF     :"+dados.getString(1));
                System.out.println("SENHA  :"+dados.getString(2));                
            }
            else{
                acesso=false;                
            }
            bd.desconecta();
        }catch(SQLException erro){
            System.out.println("Usuário inexistente");
        }
        return acesso;
    }
    
}
