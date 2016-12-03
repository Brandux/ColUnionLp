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
    
    String anoescolar;
    int idEducacion;
    int idSeccion;
    String estado;
    public GradoDTO() {
    }

    public GradoDTO(String anoescolar, int idEducacion, int idSeccion, String estado) {
        this.anoescolar = anoescolar;
        this.idEducacion = idEducacion;
        this.idSeccion = idSeccion;
        this.estado = estado;
    }

    public int getIdGrado() {
        return idGrado;
    }

    public void setIdGrado(int idGrado) {
        this.idGrado = idGrado;
    }

    public String getAnoescolar() {
        return anoescolar;
    }

    public void setAnoescolar(String anoescolar) {
        this.anoescolar = anoescolar;
    }

    public int getIdEducacion() {
        return idEducacion;
    }

    public void setIdEducacion(int idEducacion) {
        this.idEducacion = idEducacion;
    }

    public int getIdSeccion() {
        return idSeccion;
    }

    public void setIdSeccion(int idSeccion) {
        this.idSeccion = idSeccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    
    
}
