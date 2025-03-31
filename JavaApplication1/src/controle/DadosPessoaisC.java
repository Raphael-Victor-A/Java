/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;
import modelo.DadosPessoaisM;
import java.util.ArrayList;
import visao.PrincipalV;

/**
 *
 * @author rapha
 */
public class DadosPessoaisC {
    public ArrayList<DadosPessoaisM> vetDados;
    
    public DadosPessoaisC(){
        vetDados = new ArrayList<>();
    }
    
    public void cadastroDados(DadosPessoaisM dadospessoaism){
        vetDados.add(dadospessoaism);
    }
    
    public int buscaPorNome(String nome){
        int posicao =- 1;
        for(int i = 0; i<vetDados.size(); i++){
            if(vetDados.get(i).getNomeCompleto().equals(nome)){
                return i;
            }
        }
        return posicao;
    }
    
    
    public int buscaPorCpf(String cpf){
        int posicao =- 1;
        for(int i = 0; i<vetDados.size(); i++){
            if(vetDados.get(i).getCpf().equals(cpf)){
                return i;
            }
        }
        return posicao;
    }
    
    public String removerPessoa(String cpf){
        String texto;
        int posicaoDado = this.buscaPorCpf(cpf);
        if (posicaoDado != -1)
        {
            texto = "Apagado";
            vetDados.remove(posicaoDado);
        }
        else{
            texto="Impossivel de apagar ";
        }            
        return(texto);
    }
    
    public void atualizarPessoa(DadosPessoaisM dadospessoaism){
        
        int posicaoDado = this.buscaPorCpf(dadospessoaism.getCpf());

        if (posicaoDado != -1)
        {
            
            vetDados.get(posicaoDado).setCpf(dadospessoaism.getCpf());
            vetDados.get(posicaoDado).setDataNascimento(dadospessoaism.getDataNascimento());
            vetDados.get(posicaoDado).setIdade(dadospessoaism.getIdade());
            vetDados.get(posicaoDado).setSexo(dadospessoaism.getSexo());
            vetDados.get(posicaoDado).setNomeCompleto(dadospessoaism.getNomeCompleto());
        }
        else{
            
        }            
   
    }
    }
}
