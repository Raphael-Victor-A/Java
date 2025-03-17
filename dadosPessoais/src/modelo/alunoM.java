package modelo;

public class alunoM {
    private int ra;
    private int codCurso;
    private char turno;
    private dadosPessoaisM dadosPessoais;
    private enderecoM endereco;

    public alunoM(int codCurso, dadosPessoaisM dadosPessoais, enderecoM endereco, int ra, char turno) {
        this.codCurso = codCurso;
        this.dadosPessoais = dadosPessoais;
        this.endereco = endereco;
        this.ra = ra;
        this.turno = turno;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public char getTurno() {
        return turno;
    }

    public void setTurno(char turno) {
        this.turno = turno;
    }

    public dadosPessoaisM getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(dadosPessoaisM dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    public enderecoM getEndereco() {
        return endereco;
    }

    public void setEndereco(enderecoM endereco) {
        this.endereco = endereco;
    }

    public void imprimeAluno(){
        System.out.println("----IMPRESSÃO DE TODAS AS INFORMAÇÕES----");
        System.out.println("Ra: "+ getRa());
        System.out.println("Codigo curso: "+ getCodCurso());
        System.out.println("Turno: "+ getTurno());
        this.getDadosPessoais().imprimeDadosPessoais();
        this.getEndereco().imprimeEndereco();
    }
}
