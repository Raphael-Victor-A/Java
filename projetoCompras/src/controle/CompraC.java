package controle;
import java.util.ArrayList;
import modelo.CompraM;

public class CompraC {
    public ArrayList<CompraM> vetCompras;

    public CompraC(){
        vetCompras = new ArrayList<CompraM>();
    }

    public void CadastroCompra(CompraM compras){
        vetCompras.add(compras);
    }

    public int BuscaCompra(String Nome){
        int posicao =-1;
        for( int i = 0; i< vetCompras.size(); i++){
            if(vetCompras.get(i).getNome().equals(Nome)){
                posicao = i;
                System.out.println("achei");
                break;
            }
            else{
                System.out.println("Compra nao identificada!");
            }
        }
        return posicao;
    }
   
}
