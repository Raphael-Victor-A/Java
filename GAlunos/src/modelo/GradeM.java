/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author rf5974
 */
public class GradeM {
    private String curso;
    private int codigoGrade;
    private int numSemestre;
    private int chSemestre;

    public GradeM(String curso, int codigoGrade, int numSemestre, int chSemestre) {
        this.curso = curso;
        this.codigoGrade = codigoGrade;
        this.numSemestre = numSemestre;
        this.chSemestre = chSemestre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getCodigoGrade() {
        return codigoGrade;
    }

    public void setCodigoGrade(int codigoGrade) {
        this.codigoGrade = codigoGrade;
    }

    public int getNumSemestre() {
        return numSemestre;
    }

    public void setNumSemestre(int numSemestre) {
        this.numSemestre = numSemestre;
    }

    public int getChSemestre() {
        return chSemestre;
    }

    public void setChSemestre(int chSemestre) {
        this.chSemestre = chSemestre;
    }
    
    
}
