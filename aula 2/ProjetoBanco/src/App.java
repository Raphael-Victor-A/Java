import modelo.conta;
import modelo.contaCorrente;
import modelo.dadosPessoais;
import modelo.endereco;

public class App {
    public static void main(String[] args) throws Exception {
        contaCorrente c1 = new contaCorrente();
        c1.setAgencia(1);
        c1.setConta(1);
        c1.setLimite(1000.0f);
        c1.setSaldo(50.0f);
        c1.impressao();
System.out.println("-------------------------------------------------------------");
        contaCorrente c2 = new contaCorrente();
        c2.setAgencia(2);
        c2.setConta(2);
        c2.setLimite(2000.0f);
        c2.setSaldo(110.0f);
        c2.impressaoPorObjeto(c2);
System.out.println("-------------------------------------------------------------");
        contaCorrente c3 = new contaCorrente();
        c3.setAgencia(3);
System.out.println("-------------------------------------------------------------");
        contaCorrente c4 = new contaCorrente(4, 4, 4000, 400);
        c4.impressaoPorObjeto(c4);

System.out.println("-------------------------------------------------------------");
System.out.println("-------------------------DADOS PESSOAIS----------------------");

        dadosPessoais dp1 = new dadosPessoais("Raphael", "Alencar", 06514371132, 20, 'm');
        dp1.impressaoDados(dp1);

System.out.println("-------------------------------------------------------------");
System.out.println("-------------------------ENDERECO----------------------------");
        endereco end1 = new endereco("Antonio Mena", 27, "Vila gomes", "79022-320", "MS");
        end1.impressaoEndereco(end1);

System.out.println("-------------------------------------------------------------");
System.out.println("-------------------------DADOS COMPLETOS----------------------------");
        conta raphaelConta = new conta(1, 1, 100, 100, dp1, end1);
        raphaelConta.imprimeConta(raphaelConta);
    }
}
