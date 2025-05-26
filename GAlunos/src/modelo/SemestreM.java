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
public class SemestreM {

    private int codigo;
    private String nome;
    private int periodo;
    private int creditos;
    private String situacao;
    private float media;
    private float exame;
    private float mediaFinal;
    
    public SemestreM(int codigo, String nome, int periodo, int creditos, String situacao, float media, float exame, float mediaFinal) {
        this.codigo = codigo;
        this.nome = nome;
        this.periodo = periodo;
        this.creditos = creditos;
        this.situacao = situacao;
        this.media = media;
        this.exame = exame;
        this.mediaFinal = mediaFinal;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public float getExame() {
        return exame;
    }

    public void setExame(float exame) {
        this.exame = exame;
    }

    public float getMediaFinal() {
        return mediaFinal;
    }

    public void setMediaFinal(float mediaFinal) {
        this.mediaFinal = mediaFinal;
    }
}