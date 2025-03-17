package modelo;


public class CompraM extends ItemM{

    private boolean PorAtacado;

    public CompraM(String nome, float precoUnitario, int quantidade, boolean porAtacado) {
            super(nome, precoUnitario, quantidade);
            PorAtacado = porAtacado;
        }

    public boolean getPorAtacado() {
        return PorAtacado;
    }

    public void setPorAtacado(boolean porAtacado) {
        PorAtacado = porAtacado;
    }



    public void ImprimeCompra(){
        System.out.println("--------------------");

        super.ImprimeItem();
        System.out.println("Preço por atacado: "+  PorAtacado);
    }
    
    public void AlteraPreco(boolean porAtacado){
        if (porAtacado){
            super.setPrecoUnitario(super.getPrecoUnitario() * 0.75f);
        }
    }

    
}
