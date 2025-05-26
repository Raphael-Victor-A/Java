/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemafinal;

import controle.Database;
import Modelo.ProdutoM;
import Modelo.UsuarioM;
import Controle.ProdutoC;
import Controle.UsuarioC;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author ra189815
 */
public class SistemaFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Statement teste;
        ResultSet dadosBD;
        ResultSet dadosBDP;
        
        try{
            
            UsuarioM user1=new UsuarioM("b","af");
            UsuarioC banco=new UsuarioC();
            /*
            banco.Cadastrar(user1);
            dadosBD = banco.ConsultaLoginPorLogin("b");
            banco.DeletaLogin("a"); 
            banco.AtualizaUsuario("HAHAHHAA", "");
            dadosBD = banco.ConsultaGeralLogin();
            while(dadosBD.next()){
                System.out.println("Login: " + dadosBD.getString("usuario"));
                System.out.println("Senha: " + dadosBD.getString(2));

            }
*/
            ProdutoM prod1 = new ProdutoM(1, "Henrique", 39.90f, 1);
            ProdutoM prod2 = new ProdutoM(2, "Vinicius", 49.90f, 1);
            ProdutoM prod3 = new ProdutoM(3, "Pedro", 59.90f, 1);
            ProdutoC bancoProd = new ProdutoC();
            bancoProd.Cadastrar(prod1);
            bancoProd.Cadastrar(prod2);
            bancoProd.Cadastrar(prod3);
            dadosBDP = bancoProd.ConsultaGeral(1);
            bancoProd.DeletaProduto(2);
            bancoProd.AtualizaProduto("Raphael", 3);
            while(dadosBDP.next()){
                System.out.println("Produto: "+ dadosBDP.getString("nomeProduto"));
                System.out.println("Valor: "+ dadosBDP.getFloat("valorUnitario"));
            }
        }catch(Exception erro){
            erro.printStackTrace();
            
        }
    }
}
