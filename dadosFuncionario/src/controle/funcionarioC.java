package controle;
import modelo.funcionarioM;
import java.util.ArrayList;

public class funcionarioC {
    public ArrayList<funcionarioM> vetFuncionario;

    public funcionarioC(){
        vetFuncionario = new ArrayList<funcionarioM>();
    }

    public void cadastroFuncionario(funcionarioM funcionarioMo){
        vetFuncionario.add(funcionarioMo);
    }

    public int totalRegistros(){
        return vetFuncionario.size();
    }

    public void listaGeral(){
        for(funcionarioM dados:vetFuncionario){
            System.out.println("--------------");
            dados.exibirFuncionario();
        }
    }

    public int buscarPorNome(String nomeFuncionario){
        int posicao =-1;
        for(int i = 0; i < vetFuncionario.size(); i++){
            if(vetFuncionario.get(i).getNomeFuncionario().equals(nomeFuncionario)){
                posicao = i;
                break;
            }
        }
        return posicao;
    }
}
