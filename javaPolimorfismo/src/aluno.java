public class aluno {
    private int ra;
    private int codCurso;
    private char turno;
    private int idade;
    
    
    public aluno(int ra, int codCurso, char turno, int idade) {
        this.ra = ra;
        this.codCurso = codCurso;
        this.turno = turno;
        this.idade = idade;
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
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

}
