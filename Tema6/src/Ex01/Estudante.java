/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex01;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * Classe estudante, em cumprimento do exercício sobre Hibernate
 *
 * @author 50enta
 */
@Entity
public class Estudante {
    @Id
    @GeneratedValue
    private Integer id;
    private String nomeEstudante;
    private String numeroEstudante;
    private double nota1;
    private double nota2;
    private double nota3;
    @Transient
    private double media;

    public Estudante() {

    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    private void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the nomeEstudante
     */
    public String getNomeEstudante() {
        return nomeEstudante;
    }

    /**
     * @param nomeEstudante the nomeEstudante to set
     */
    public void setNomeEstudante(String nomeEstudante) {
        this.nomeEstudante = nomeEstudante;
    }

    /**
     * @return the numeroEstudante
     */
    public String getNumeroEstudante() {
        return numeroEstudante;
    }

    /**
     * @param numeroEstudante the numeroEstudante to set
     */
    public void setNumeroEstudante(String numeroEstudante) {
        this.numeroEstudante = numeroEstudante;
    }

    /**
     * @return the nota1
     */
    public double getNota1() {
        return nota1;
    }

    /**
     * @param nota1 the nota1 to set
     */
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    /**
     * @return the nota2
     */
    public double getNota2() {
        return nota2;
    }

    /**
     * @param nota2 the nota2 to set
     */
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    /**
     * @return the nota3
     */
    public double getNota3() {
        return nota3;
    }

    /**
     * @param nota3 the nota3 to set
     */
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    /**
     * @return the media
     */
    public double getMedia() {
      return this.getNota1()+this.getNota2()+this.getNota3();
    }

    /**
     * @param media the media to set
     */
    public void setMedia(double media) {
        this.media = media;
    }

    
}
