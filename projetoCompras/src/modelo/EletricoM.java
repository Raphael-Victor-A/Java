package modelo;

public class EletricoM extends ItemM{
    private int Potencia;
    private int Rotacao;
    private int Tensao;
    private int Capacidade;
    private char Tipo;
    private String Marca;

    public EletricoM(int Capacidade, String Marca, int Potencia, int Rotacao, int Tensao, char Tipo, String nome, float precoUnitario, int quantidade) {
        super(nome, precoUnitario, quantidade);
        this.Capacidade = Capacidade;
        this.Marca = Marca;
        this.Potencia = Potencia;
        this.Rotacao = Rotacao;
        this.Tensao = Tensao;
        this.Tipo = Tipo;
    }

    public int getPotencia() {
        return Potencia;
    }

    public void setPotencia(int Potencia) {
        this.Potencia = Potencia;
    }

    public int getRotacao() {
        return Rotacao;
    }

    public void setRotacao(int Rotacao) {
        this.Rotacao = Rotacao;
    }

    public int getTensao() {
        return Tensao;
    }

    public void setTensao(int Tensao) {
        this.Tensao = Tensao;
    }

    public int getCapacidade() {
        return Capacidade;
    }

    public void setCapacidade(int Capacidade) {
        this.Capacidade = Capacidade;
    }

    public char getTipo() {
        return Tipo;
    }

    public void setTipo(char Tipo) {
        this.Tipo = Tipo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void imprimeEletrico(){
        System.out.println("--------------------");
        super.ImprimeItem();
        System.out.println("Potencia: "+ getPotencia());
        System.out.println("Rotacao: "+ getRotacao());
        System.out.println("Tensao: "+ getTensao());
        System.out.println("Capacidade: "+ getCapacidade());
        System.out.println("Tipo: "+ getTipo());
        System.out.println("Marca: "+ getMarca());
    }
}
