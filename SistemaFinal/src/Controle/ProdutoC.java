/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;
import controle.Database;
import java.sql.ResultSet;
import java.sql.Statement;
import Modelo.ProdutoM;

/**
 *
 * @author rapha
 */
public class ProdutoC {
    private Database dao=new Database();
    public Statement stmt;
    public ResultSet dadosConsulta;
    String comando = "";
    
    public void Cadastrar(ProdutoM produtom){
        try{
            dao.conexao();
            String SQL="insert into produto(codigoProduto,nomeProduto,valorUnitario,disponivel) values "
                    + "('"+produtom.getCodigoProduto()+"','"+produtom.getNomeProduto()+"','"+produtom.getValorUnitario()+"','"+produtom.getDisponivel()+"')";
            dao.getStatement().execute(SQL);
            dao.desconecta();
        }catch(Exception tipoExcecao){
            System.out.println("Erro");
            tipoExcecao.printStackTrace();
            
        }
    }
    public ResultSet ConsultaGeral(int produto){
        try{
            dao.conexao();
            String SQL = "select * from produto where codigoProduto ='"+produto+"' ";
            dadosConsulta = dao.getStatement().executeQuery(SQL);
            dao.desconecta();
        }catch(Exception erro){
            erro.printStackTrace();
        }
        return dadosConsulta;
    }
    public void DeletaProduto(int produto){
        try{
             
            dao.conexao();
            String SQL = "delete from produto where codigoProduto ='"+produto+"' ";
            System.out.println("deletar");
            dao.getStatement().execute(SQL);
            dao.desconecta();
        }catch(Exception erro){
            erro.printStackTrace();
            System.out.println("fodeu no delete");
        }
    }

    public void AtualizaProduto(String nomeProduto, int produto){
        try{
             
            dao.conexao();
            String SQL = "update produto set nomeProduto = '"+nomeProduto+"', codigoProduto = '"+produto+"' where codigoProduto ='"+produto+"' ";
            System.out.println("atualizado");
            dao.getStatement().executeUpdate(SQL);
            dao.desconecta();
        }catch(Exception erro){
            erro.printStackTrace();
            System.out.println("nao att");
        }
    }
    }
