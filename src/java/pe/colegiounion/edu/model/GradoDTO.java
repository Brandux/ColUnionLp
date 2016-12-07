/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.colegiounion.edu.model;

/**
 *
 * @author Brandukosky
 */
public class GradoDTO {
    
    int idGrado;
    int idEducacion;
    String anoescolar;
    String estado;
    String secciones;
    public GradoDTO() {
    }

    public GradoDTO(int idEducacion, String anoescolar, String estado, String secciones) {
        this.idEducacion = idEducacion;
        this.anoescolar = anoescolar;
        this.estado = estado;
        this.secciones = secciones;
    }

    public int getIdGrado() {
        return idGrado;
    }

    public void setIdGrado(int idGrado) {
        this.idGrado = idGrado;
    }

    public int getIdEducacion() {
        return idEducacion;
    }

    public void setIdEducacion(int idEducacion) {
        this.idEducacion = idEducacion;
    }

    public String getAnoescolar() {
        return anoescolar;
    }

    public void setAnoescolar(String anoescolar) {
        this.anoescolar = anoescolar;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSecciones() {
        return secciones;
    }

    public void setSecciones(String secciones) {
        this.secciones = secciones;
    }

    
}
