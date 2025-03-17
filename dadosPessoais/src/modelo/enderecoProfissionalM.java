package modelo;

public class enderecoProfissionalM extends enderecoM{
    private int numeroDaSala;
    private int andar;

    public enderecoProfissionalM(int andar, int numeroDaSala, String cep, String complemento, String estado, String municipio, int numero, String rua) {
        super(cep, complemento, estado, municipio, numero, rua);
        this.andar = andar;
        this.numeroDaSala = numeroDaSala;
    }

    public int getNumeroDaSala() {
        return numeroDaSala;
    }

    public void setNumeroDaSala(int numeroDaSala) {
        this.numeroDaSala = numeroDaSala;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public void imprimirEnderecoProfissional(){
        System.out.println("-----END PROFISSIONARL - IMPRIMIR ------");
        System.out.println("----------------");
        this.imprimeEndereco();
        System.out.println("----------------");
        System.out.println("Numero da sala: " + getNumeroDaSala());
        System.out.println("Andar: "+ getAndar());
    }
}
