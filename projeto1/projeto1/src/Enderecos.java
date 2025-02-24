public class Enderecos {
    private String rua;
    private int numero;
    private String bairro;
    private String cep;


    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    

    public void imprimirEnd(){
        System.out.println("Rua: "+ this.getRua());
        System.out.println("Numero: "+ this.getNumero());
        System.out.println("Bairro: "+ this.getBairro());
        System.out.println("Cep: "+ this.getCep());

    }
}
