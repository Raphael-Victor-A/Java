package modelo;

public class ItemM {
    private String Nome;
    private float PrecoUnitario;
    private int Quantidade;

    public ItemM(String nome, float precoUnitario, int quantidade) {
        Nome = nome;
        PrecoUnitario = precoUnitario;
        Quantidade = quantidade;
    }
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public float getPrecoUnitario() {
        return PrecoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        PrecoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int quantidade) {
        Quantidade = quantidade;
    }

    public void ImprimeItem(){
        System.out.println("--------------------");
        System.out.println("Nome: "+ getNome());
        System.out.println("PrecoUnitario: "+ getPrecoUnitario());
        System.out.println("Quantidade: "+ getQuantidade());
    }

    

}
