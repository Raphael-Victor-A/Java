/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;
import Modelo.UsuarioM;
import controle.Database;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author ra189815
 */
public class UsuarioC {
    private Database dao=new Database();
    public Statement stmt;
    public ResultSet dadosConsulta;
    String comando = "";
    
    public void Cadastrar(UsuarioM usuariom){
        try{
            dao.conexao();
            String SQL="insert into login(usuario,senha) values "
                    + "('"+usuariom.getUsuario()+"','"+usuariom.getSenha()+"')";
            dao.getStatement().execute(SQL);
            dao.desconecta();
        }catch(Exception tipoExcecao){
            System.out.println("Erro");
            tipoExcecao.printStackTrace();
            
        }
        
    }
    
    public ResultSet ConsultaGeralLogin(){
        try{
            dao.conexao();
            String SQL = "select * from login";
            dadosConsulta = dao.getStatement().executeQuery(SQL);
            dao.desconecta();
        }catch(Exception erro){
            erro.printStackTrace();
        }
        return dadosConsulta;
    }
    public ResultSet ConsultaLoginPorLogin(String login){
        
        try{
            dao.conexao();
            String SQL = "select * from login where usuario ='"+login+"' ";
            dadosConsulta = dao.getStatement().executeQuery(SQL);
            dao.desconecta();
        }catch(Exception erro){
            erro.printStackTrace();
        }
        return dadosConsulta;
    }
    public void DeletaLogin(String login){
        try{
             
            dao.conexao();
            String SQL = "delete from login where usuario ='"+login+"' ";
            System.out.println("deletar");
            dao.getStatement().execute(SQL);
            dao.desconecta();
        }catch(Exception erro){
            erro.printStackTrace();
            System.out.println("fodeu no delete");
        }
    }
    
    public void AtualizaUsuario(String senha, String login){
        try{
             
            dao.conexao();
            String SQL = "update login set senha = '"+senha+"', usuario = '"+login+"' where usuario ='"+login+"' ";
            System.out.println("atualizado");
            dao.getStatement().executeUpdate(SQL);
            dao.desconecta();
        }catch(Exception erro){
            erro.printStackTrace();
            System.out.println("nao att");
        }
    }
}

