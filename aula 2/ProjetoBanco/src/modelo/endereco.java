package modelo;

public class endereco {
    
    private String rua;
    private int numero;
    private String bairro;
    private String cep;
    private String estado;
    
    public endereco(String rua, int numero, String bairro, String cep, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.estado = estado;
    }

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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    public void impressaoEndereco(endereco obj){
        System.out.println("Rua: "+getRua());
        System.out.println("Numero: "+ getNumero());
        System.out.println("Bairro: "+ getBairro());
        System.out.println("Cep: "+ getCep());
        System.out.println("Estado: "+ getEstado());
    }
}
