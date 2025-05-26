/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controle;

import java.sql.ResultSet;
import modelo.SemestreM;

/**
 *
 * @author rf5974
 */
public class SemestreC {
    BancoDados bd=new BancoDados();
    public ResultSet dados;
        
    public void salvarGrade(SemestreM obj){
        try{
            bd.conexao();
            String sql="insert into grade values('"+obj.getCodigo()+"',"+obj.getNome()+","
                    + ""+obj.getPeriodo()+","+obj.getCreditos()+"," +obj.getSituacao()+","+obj.getMedia()+","+obj.getExame()+","+obj.getMediaFinal()+")";
            bd.getStatement().execute(sql);
            
            javax.swing.JOptionPane aviso = new javax.swing.JOptionPane();
            aviso.showMessageDialog(null, "Grade Cadastrada");
            
            bd.desconecta();
        }catch(Exception er){
            er.printStackTrace();
        }
    }
    
    public ResultSet ContaGeralGrades(){        
        try{
            bd.conexao();
            String sql="SELECT * FROM GRADE";
            dados=bd.getStatement().executeQuery(sql);
            bd.desconecta();
        }catch(Exception erro){
            erro.printStackTrace();
        }        
        return dados;
    }
    
    public ResultSet ContaGradesPorCOdGrade(int cod){        
        try{
            bd.conexao();
            String sql="SELECT * FROM GRADE WHERE CODGRADE="+cod+"";
            dados=bd.getStatement().executeQuery(sql);
            bd.desconecta();
        }catch(Exception erro){
            erro.printStackTrace();
        }        
        return dados;
    }
    
    
}
