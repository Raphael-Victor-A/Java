package Controlador;

import Modelo.VendedorM;
import java.util.ArrayList;

/**
 *
 * @author arthu
 */
public class VendedorC {
    public ArrayList<VendedorM> vetVendedor;

    public VendedorC() {
        vetVendedor = new ArrayList<VendedorM>();
    }

    public void CadastroVendedor(VendedorM vend) {
        vetVendedor.add(vend);
    }

    public int BuscaVendedor(String setor) {
        int posicao = -1;
        for (int i = 0; i < vetVendedor.size(); i++) {
            if (vetVendedor.get(i).getSetor().equalsIgnoreCase(setor)) {
                posicao = i;
                System.out.println("ENCONTRADO NA POSICAO: " + posicao);
                System.out.println("Setor: " + vetVendedor.get(i).getSetor());
                System.out.println("Total de Vendas: " + vetVendedor.get(i).getTotalDeVendas());
                System.out.println("Meta de Venda: " + vetVendedor.get(i).getMetaDeVenda());
                System.out.println("Salário: " + vetVendedor.get(i).getSalario());
                System.out.println("Data Início: " + vetVendedor.get(i).getDataInicio());
                System.out.println("Data Término: " + vetVendedor.get(i).getDataTermino());
                vetVendedor.get(i).Pontuacao(
                    vetVendedor.get(i).getTotalDeVendas(),
                    vetVendedor.get(i).getMetaDeVenda()
                );
                break;
            }
        }
        if (posicao == -1) {
            System.out.println("SETOR NÃO ENCONTRADO!");
        }
        return posicao;
    }

    public boolean RemoverVendedor(String setor) {
        int pos = BuscaVendedor(setor);
        if (pos != -1) {
            vetVendedor.remove(pos);
            System.out.println("Vendedor removido com sucesso.");
            return true;
        }
        System.out.println("Vendedor não encontrado para remoção.");
        return false;
    }

    public boolean AtualizarVendedor(String setor, String novaDataInicio, String novaDataTermino, float novaMeta, float novoSalario, int novoTotalVendas) {
        int pos = BuscaVendedor(setor);
        if (pos != -1) {
            VendedorM vend = vetVendedor.get(pos);
            vend.setDataInicio(novaDataInicio);
            vend.setDataTermino(novaDataTermino);
            vend.setMetaDeVenda(novaMeta);
            vend.setSalario(novoSalario);
            vend.setTotalDeVendas(novoTotalVendas);
            System.out.println("Vendedor atualizado com sucesso.");
            return true;
        }
        System.out.println("Vendedor não encontrado para atualização.");
        return false;
    }

    public void VariacaoDeVendas() {
        if (vetVendedor.isEmpty()) {
            System.out.println("Nenhum vendedor cadastrado.");
            return;
        }

        float melhorPontuacao = -1;
        float menorPontuacao = 101;

        for (VendedorM vend : vetVendedor) {
            float meta = vend.getMetaDeVenda();
            float total = vend.getTotalDeVendas();
            float pontuacao;

            if (total == meta) {
                pontuacao = 100;
            } else if (total > meta) {
                pontuacao = (meta / total) * 100;
            } else {
                pontuacao = 0;
            }

            if (pontuacao > melhorPontuacao) {
                melhorPontuacao = pontuacao;
            }
            if (pontuacao < menorPontuacao) {
                menorPontuacao = pontuacao;
            }
        }

        System.out.println("Melhor Pontuação: " + melhorPontuacao);
        System.out.println("Menor Pontuação: " + menorPontuacao);
    }
}
