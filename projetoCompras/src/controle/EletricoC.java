package controle;
import java.util.ArrayList;
import modelo.EletricoM;

public class EletricoC {
    public ArrayList<EletricoM> vetEletrico;

    public EletricoC() {
        vetEletrico = new ArrayList<EletricoM>();
    }

    public void CadastroMaquina(EletricoM eletricoM){
        vetEletrico.add(eletricoM);
    }

    public int BuscaPorMarca(String marcao){
        int posicao =-1;
        for( int i = 0; i< vetEletrico.size(); i++){
            if(vetEletrico.get(i).getNome().equals(marcao)){
                vetEletrico.get(i).imprimeEletrico();
                posicao = i;
                System.out.println("achei");
                break;
            }else{
                System.out.println("Maquina nao identificada!");
            }
        }
        return posicao;
    }

    public int BuscarPorTipo(char Tipo){
        int quantidadePorTipo = 0;
        for(int i = 0; i< vetEletrico.size(); i++){
            if (vetEletrico.get(i).getTipo()==Tipo){
                quantidadePorTipo++;
            }
        }

        System.out.println("QNTD POR TIPO "+ Tipo+":"+quantidadePorTipo);
        return quantidadePorTipo;
    }

    public void RemoverEquipamento(EletricoM eletricoM){
        vetEletrico.remove(eletricoM);
    }
}
