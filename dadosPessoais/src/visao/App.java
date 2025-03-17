package visao;
import controle.enderecoC;
import modelo.alunoM;
import modelo.dadosPessoaisM;
import modelo.enderecoM;
import modelo.enderecoProfissionalM;

public class App {
    public static void main(String[] args) throws Exception {
        dadosPessoaisM dp = new dadosPessoaisM("06514371132", 20, "Raphael", 'm', "Alencar");
        enderecoM end = new enderecoM("79022320", "casa", "ms", "cg", 27, "Antonio mena gonçalves");
        alunoM al = new alunoM(130, dp, end, 189362, 'm');
        al.imprimeAluno();
        
        enderecoM end1 = new enderecoM("123", "casa", "ms", "cg", 123, "wqerq");
        enderecoM end2 = new enderecoM("456", "casa", "ms", "cg", 234, "qweqwe");

        enderecoC endc = new enderecoC();
        endc.cadastroEndereco(end1);
        endc.cadastroEndereco(end2);
        endc.buscaCompletaEnd();
        int posicao = endc.imprimirPorCep("456");
        System.out.println("Posicao por objeto: "+ posicao);

        enderecoProfissionalM end4 = new enderecoProfissionalM(posicao, posicao, "123123", "casa", "ms", "cg", posicao, "aaa");
        end4.imprimirEnderecoProfissional();
    }
}
