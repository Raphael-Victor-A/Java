package modelo;

public class enderecoM {
    private String rua;
    private int numero;
    private String cep;
    private String estado;
    private String municipio;
    private String complemento;

    public enderecoM(String cep, String complemento, String estado, String municipio, int numero, String rua) {
        this.cep = cep;
        this.complemento = complemento;
        this.estado = estado;
        this.municipio = municipio;
        this.numero = numero;
        this.rua = rua;
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

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void imprimeEndereco(){
        System.out.println("----Endereço - IMPRESSÃ0----");
        System.out.println("Rua: "+ getRua());
        System.out.println("Numero: "+ getNumero());
        System.out.println("Cep :"+ getCep());
        System.out.println("Estado: "+ getEstado());
        System.out.println("Municipio: "+ getMunicipio());
        System.out.println("Complemento: "+ getComplemento());



    }
}
