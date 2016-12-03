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
public class EstadoDTO {
    int idEstado;
    String tipoestado;
    String estado;
    
    public EstadoDTO() {
    }

    public EstadoDTO(String tipoestado, String estado) {
        this.tipoestado = tipoestado;
        this.estado = estado;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getTipoestado() {
        return tipoestado;
    }

    public void setTipoestado(String tipoestado) {
        this.tipoestado = tipoestado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
