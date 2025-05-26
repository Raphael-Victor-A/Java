
//CLASSE CONEXAO e DESCONEXÃO USANDO JDBC

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;
/*
Imports para manipulação e conexão com o SQL
*/
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author rf5974
 */
//DAO: Data Access OBject

public class Database {
     // Objeto de Conexão e desconexão com BD
    public Connection conn;
    // Objeto de comando DML(Dicionario de manipulação de dados)
    //dml select, insert, delete e update
    public Statement stmt;
    // Objeto com dados (ArrayList com n tuplas) SQL
    private ResultSet res;
    /*
    PROCEDIMENTO (Void) que realiza a conexão fisica com o PostgrESQL
    COMO?
    1-Usar drive JDBC
    2-Informar login e senha do usuario no SGBD
    3-Define o Banco de dados e o Processo (Porta de conexão: 5432)
    */
    public void conexao(){                        
       try
       {
        Class.forName("org.postgresql.Driver"); 
        conn = DriverManager.getConnection(
               "jdbc:postgresql://localhost:5432/paradigmas","postgres", "4661");
        System.out.println("Conectado ao PostGreSQL.");        
        }catch(Exception e){
            System.out.println("Falha ao tentar a conexão");
            e.printStackTrace();
        }
    }
    
     public Connection getConnection(){
        return conn;
    }
    
   public Statement getStatement(){
        try {
                Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/paradigmas","postgres", "4661");
             return conn.createStatement();
         } catch (SQLException e) {
             e.printStackTrace();
             return null;
         }
     }
    
    public void desconecta(){
        if(conn != null){
            try{
                conn.close();
            }catch(SQLException erro){
                erro.printStackTrace();
            }
            
        }
    }
}