package visao;
import controle.CompraC;
import controle.EletricoC;
import modelo.CompraM;
import modelo.EletricoM;
import modelo.ItemM;

public class App {
    public static void main(String[] args) throws Exception {
        ItemM vassoura = new ItemM("Vassoura", 10.0f, 10);
        ItemM rodo = new ItemM("Rodo", 15.0f, 5);
        ItemM pano = new ItemM("Pano", 5.0f, 20);


        vassoura.ImprimeItem();
        rodo.ImprimeItem();
        pano.ImprimeItem();

        
        CompraM compra1 = new CompraM("Vassoura", 10.0f, 10, false);
        CompraM compra2 = new CompraM("Rodo", 15.0f, 5, false);
        CompraM compra3 = new CompraM("Pano", 5.0f, 20, true);

        compra1.ImprimeCompra();
        compra2.ImprimeCompra();
        compra3.ImprimeCompra();


        CompraC compraC = new CompraC();
        compraC.CadastroCompra(compra1);
        compraC.CadastroCompra(compra2);
        compraC.CadastroCompra(compra3);

        compraC.BuscaCompra("Vassoura");
        compraC.BuscaCompra("Rodo");
        compraC.BuscaCompra("Pano");

        EletricoM aspirador = new EletricoM(2000, "Electrolux", 2000, 2000, 220, 'A', "Aspirador", 200.0f, 5);
        EletricoM ventilador = new EletricoM(2000, "Electrolux", 2000, 2000, 220, 'A', "Ventilador", 200.0f, 5);
        EletricoM liquidificador = new EletricoM(2000, "Electrolux", 2000, 2000, 220, 'A', "Liquidificador", 200.0f, 5);

        aspirador.ImprimeItem();
        ventilador.ImprimeItem();
        liquidificador.ImprimeItem();

        EletricoC eletricoC = new EletricoC();
        eletricoC.CadastroMaquina(aspirador);
        eletricoC.CadastroMaquina(ventilador);
        eletricoC.CadastroMaquina(liquidificador);

        eletricoC.BuscaPorMarca("Aspirador");
        eletricoC.BuscarPorTipo('A');

        

        
    }
}
