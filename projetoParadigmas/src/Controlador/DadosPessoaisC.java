/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.DadosPessoaisM;
import Modelo.EnderecoM;
import java.util.ArrayList;

/**
 *
 * @author arthu
 */
public class DadosPessoaisC {
     public ArrayList<DadosPessoaisM> vetDadosPessoais;
    
      public  DadosPessoaisC(){
        vetDadosPessoais = new ArrayList<DadosPessoaisM>();
    }
    public void CadastroEndereco(DadosPessoaisM dadospessoaism){
        vetDadosPessoais.add(dadospessoaism);
    }
    
    public int BuscaDadosPessoais(String cpf){
        int posicao = -1;
        for(int i = 0; i<vetDadosPessoais.size();i++){
            if(vetDadosPessoais.get(i).getCpf().equals(cpf)){
                posicao = i;
                System.out.println("ENCONTRADO NA POSICAO : "+posicao);
                System.out.println("Nome: "+ vetDadosPessoais.get(i).getNome());
                System.out.println("Sobrenome: "+vetDadosPessoais.get(i).getSobrenome());
                System.out.println("CPF: "+vetDadosPessoais.get(i).getCpf());
                System.out.println("Idade: "+vetDadosPessoais.get(i).getIdade());
                System.out.println("Sexo: "+vetDadosPessoais.get(i).getSexo());
                vetDadosPessoais.get(i).getEndereco().PrintEndereco();
                System.out.println("-------------------------------------------");
                break;
            }
            
        }
        
        if (posicao == -1) {
        System.out.println("CPF NAO ENCONTRADO!!");
        }
        return posicao;
    }
    
    public boolean RemoverPorCpf(String cpf) {
    for (int i = 0; i < vetDadosPessoais.size(); i++) {
        if (vetDadosPessoais.get(i).getCpf().equals(cpf)) {
            vetDadosPessoais.remove(i);
            System.out.println("Cadastro com CPF " + cpf + " removido com sucesso.");
            return true;
        }
    }
    System.out.println("CPF não encontrado para remoção.");
    return false;
    }
    
    public boolean AtualizarPorCpf(String cpf, String novoNome, String novoSobrenome, int novaIdade, char novoSexo, EnderecoM novoEndereco) {
    for (int i = 0; i < vetDadosPessoais.size(); i++) {
        if (vetDadosPessoais.get(i).getCpf().equals(cpf)) {
            DadosPessoaisM dp = vetDadosPessoais.get(i);
            dp.setNome(novoNome);
            dp.setSobrenome(novoSobrenome);
            dp.setIdade(novaIdade);
            dp.setSexo(novoSexo);
            dp.setEndereco(novoEndereco);
            System.out.println("Cadastro com CPF: " + cpf + " atualizado com sucesso!");
            return true;
        }
    }
    System.out.println("CPF NAO ENCONTRADO!!");
    return false;
}
    
}
