package visao;
import controle.funcionarioC;
import modelo.funcionarioM;
import modelo.gerenteM;

public class App {
    public static void main(String[] args) throws Exception {
        funcionarioM raphael = new funcionarioM(13 , "09/09", "raphael", 'v');
        raphael.exibirFuncionario(); 

        gerenteM ger = new gerenteM(123.0f, 1, "09/09", 122.0f, 14, "0/0", "stuart little", 'i');

        ger.exibirGerente();

        funcionarioM f1 = new funcionarioM(0, "0", "0", '0');
        funcionarioM f2 = new funcionarioM(1, "1", "1", '1');


        funcionarioC controle = new funcionarioC();
        controle.cadastroFuncionario(f1);
        
        controle.cadastroFuncionario(f2);
        controle.listaGeral();
        controle.totalRegistros();
        int posicao = controle.buscarPorNome("0");
        System.out.println(posicao);
        
    }
}
