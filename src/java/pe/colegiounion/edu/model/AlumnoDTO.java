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
public class AlumnoDTO {
    int idAlumno;
    String estado;
    
    

    public AlumnoDTO() {
    }

    public AlumnoDTO(String estado) {
        this.estado = estado;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
   
}
