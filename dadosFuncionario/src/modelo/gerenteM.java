package modelo;


public class gerenteM extends funcionarioM {
    private int codSetor;
    private String inicioGerente;
    private float meta;
    private float bonusSalario;

    public gerenteM(float bonusSalario, int codSetor, String inicioGerente, float meta, int codFuncionario, String dataContratacao, String nomeFuncionario, char regimeTrabalho) {
        super(codFuncionario, dataContratacao, nomeFuncionario, regimeTrabalho);
        this.bonusSalario = bonusSalario;
        this.codSetor = codSetor;
        this.inicioGerente = inicioGerente;
        this.meta = meta;
    }

    public int getCodSetor() {
        return codSetor;
    }

    public void setCodSetor(int codSetor) {
        this.codSetor = codSetor;
    }

    public String getInicioGerente() {
        return inicioGerente;
    }

    public void setInicioGerente(String inicioGerente) {
        this.inicioGerente = inicioGerente;
    }

    public float getMeta() {
        return meta;
    }

    public void setMeta(float meta) {
        this.meta = meta;
    }

    public float getBonusSalario() {
        return bonusSalario;
    }

    public void setBonusSalario(float bonusSalario) {
        this.bonusSalario = bonusSalario;
    }

    public void exibirGerente(){
        System.out.println("------------------------------------------------");
        exibirFuncionario();
        System.out.println("codSetor:"+ getCodSetor() );
        System.out.println("inicioGerente:"+ getInicioGerente());
        System.out.println("meta:"+getMeta() );
        System.out.println("bonusSalario:"+ getBonusSalario());
        System.out.println("------------------------------------------------");

    }
    
    
}
