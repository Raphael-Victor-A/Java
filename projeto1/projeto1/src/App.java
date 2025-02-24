
public class App {
    public static void main(String[] args) throws Exception {
        DadosPessoais raphael = new DadosPessoais();
        Enderecos endereco = new Enderecos();

        raphael.setIdade(20);
        raphael.setPrimeiroNome("Raphael");
        raphael.setSobrenome("Alencar");
        raphael.setCpf("06514371132");
        raphael.setSexo('M');
        raphael.setDataNascimento("09/09/2004");
        raphael.imprimirDP();

        endereco.setRua("Rua antonio mena goncalves");
        endereco.setNumero(27);
        endereco.setBairro("Vila gomes");
        endereco.setCep("79022320");
        endereco.imprimirEnd();
    }
}
