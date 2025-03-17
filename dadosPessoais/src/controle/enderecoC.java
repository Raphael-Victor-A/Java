package controle;
import modelo.enderecoM;
import java.util.ArrayList;

public class enderecoC {
    public ArrayList<enderecoM> vetEndereco;

    public enderecoC(){
        vetEndereco = new ArrayList<enderecoM>();   
    }

    public void cadastroEndereco(enderecoM endM){
        vetEndereco.add(endM);
    }

    public void buscaCompletaEnd(){
        for(enderecoM dados:vetEndereco){
            dados.imprimeEndereco();
        }
    }
    public int imprimirPorCep(String cep){
        int posicao =- 1;
        for(int i = 0; i<vetEndereco.size(); i++){
            if(vetEndereco.get(i).getCep().equals(cep)){
                return i;
            }
        }
        return posicao;
    }
}

