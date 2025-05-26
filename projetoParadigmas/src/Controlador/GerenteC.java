package Controlador;

import Modelo.GerenteM;
import java.util.ArrayList;

public class GerenteC {
    public ArrayList<GerenteM> vetGerente;

    public GerenteC() {
        vetGerente = new ArrayList<GerenteM>();
    }

    public void CadastroGerente(GerenteM gerente) {
        vetGerente.add(gerente);
    }

    public int BuscaGerente(int area) {
        int posicao = -1;
        for (int i = 0; i < vetGerente.size(); i++) {
            if (vetGerente.get(i).getArea() == area) {
                posicao = i;
                System.out.println("ENCONTRADO NA POSICAO : " + posicao);
                System.out.println("Area: " + vetGerente.get(i).getArea());
                System.out.println("Local: " + vetGerente.get(i).getLocal());
                System.out.println("Bonus: " + vetGerente.get(i).getBonus());
                System.out.println("Meta: " + vetGerente.get(i).getMeta());
                break;
            }
        }
        if (posicao == -1) {
            System.out.println("GERENTE NAO ENCONTRADO!!");
        }
        return posicao;
    }

    public boolean RemoverGerente(int area) {
        int pos = BuscaGerente(area);
        if (pos != -1) {
            vetGerente.remove(pos);
            System.out.println("Gerente removido com sucesso.");
            return true;
        }
        System.out.println("Gerente não encontrado para remoção.");
        return false;
    }

    public boolean AtualizarGerente(int area, String novoLocal, float novoBonus, float novaMeta) {
        int pos = BuscaGerente(area);
        if (pos != -1) {
            GerenteM gerente = vetGerente.get(pos);
            gerente.setLocal(novoLocal);
            gerente.setBonus(novoBonus);
            gerente.setMeta(novaMeta);

            System.out.println("Gerente atualizado com sucesso.");
            return true;
        }
        System.out.println("Gerente não encontrado para atualização.");
        return false;
    }
}
