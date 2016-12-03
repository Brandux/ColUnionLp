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
public class SeccionDTO {
    
    int idSeccion;
    String tiposeccion;
    String estado;

    public SeccionDTO() {
    }

    public SeccionDTO(String tiposeccion, String estado) {
        this.tiposeccion = tiposeccion;
        this.estado = estado;
    }

    public int getIdSeccion() {
        return idSeccion;
    }

    public void setIdSeccion(int idSeccion) {
        this.idSeccion = idSeccion;
    }

    public String getTiposeccion() {
        return tiposeccion;
    }

    public void setTiposeccion(String tiposeccion) {
        this.tiposeccion = tiposeccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
